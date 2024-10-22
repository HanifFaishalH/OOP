package UTS;

import java.util.ArrayList;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    private ArrayList<Tanaman> inventori;

    public Pemain(String nama, int uang, int energi) {
        this.nama = nama;
        this.uang = uang;
        this.energi = energi;
        this.inventori = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }
    public int getUang() {
        return uang;
    }
    public int getEnergi() {
        return energi;
    }
    public ArrayList<Tanaman> getInventori() {
        return inventori;
    }

    public void kurangiEnergi(int amount) {
        energi -= amount;
        if (energi < 0) energi = 0;
        System.out.println("Energi berkurang sebesar " + amount + ". Energi sekarang: " + energi);
    }

    public void resetEnergi() {
        energi = 100;
        System.out.println("Energi penuh kembali! Energi sekarang: " + energi);
    }

    public void tambahUang(int amount) {
        uang += amount;
        System.out.println("Uang bertambah sebesar " + amount + ". Uang sekarang: " + uang);
    }

    public void tambahHasilPanen(Tanaman hasilPanen) {
        inventori.add(hasilPanen);
        System.out.println(hasilPanen.getNama() + " telah ditambahkan ke inventori.");
    }

    public void lihatInventori() {
        if (inventori.isEmpty()) {
            System.out.println("Inventori kosong.");
        } else {
            System.out.println("Isi inventori:");
            for (int i = 0; i < inventori.size(); i++) {
                Tanaman tanaman = inventori.get(i);
                System.out.println((i + 1) + ". " + tanaman.getNama());
            }
        }
    }

    public void jualHasilPanen(int index, int harga) {
        index = index - 1;
        if (index >= 0 && index < inventori.size()) {
            Tanaman tanamanTerjual = inventori.remove(index);
            int jumlahBuah = tanamanTerjual.getJumlah();
            int totalHarga = jumlahBuah*harga;
            tambahUang(totalHarga);
            System.out.println(tanamanTerjual.getNama() + " berhasil dijual dengan harga " + totalHarga);
        } else {
            System.out.println("Indeks tidak valid. Tidak ada tanaman yang terjual.");
        }
    }
    

    public void cekStatusPemain() {
        System.out.println("Nama: " + nama);
        System.out.println("Uang: " + uang);
        System.out.println("Energi: " + energi);
        lihatInventori();
    }
}
