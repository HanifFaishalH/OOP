package jobsheet4.tugasPercobaan;

import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> bukuList;
    private ArrayList<Anggota> anggotaList;
    private ArrayList<Peminjaman> peminjamanList;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.bukuList = new ArrayList<>();
        this.anggotaList = new ArrayList<>();
        this.peminjamanList = new ArrayList<>();
    }

    public void tambahBuku(Buku b) {
        bukuList.add(b);
    }

    public void tambahAnggota(Anggota a) {
        anggotaList.add(a);
    }

    public void pinjamBuku(Anggota a, Buku b, String tanggal) {
        if (a == null) {
            System.out.println("Anggota tidak valid.");
            return;
        }
        if (b == null) {
            System.out.println("Buku tidak valid.");
            return;
        }

        if (!b.isDipinjam()) {
            Peminjaman peminjaman = new Peminjaman(a, b, tanggal);
            peminjamanList.add(peminjaman);
            System.out.println("Buku berhasil dipinjam: " + b.getJudul());
        } else {
            System.out.println("Buku " + b.getJudul() + " sudah dipinjam.");
        }
    }

    public String info() {
        StringBuilder info = new StringBuilder("Perpustakaan: " + nama + "\n");
        info.append("Buku:\n");
        for (Buku buku : bukuList) {
            info.append(buku.info()).append("\n");
        }
        info.append("Anggota:\n");
        for (Anggota anggota : anggotaList) {
            info.append(anggota.info()).append("\n");
        }
        info.append("Peminjaman:\n");
        for (Peminjaman peminjaman : peminjamanList) {
            info.append(peminjaman.info()).append("\n");
        }
        return info.toString();
    }
}
