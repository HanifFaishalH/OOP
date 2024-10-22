package UTS;

import java.util.Random;

public class Tanaman {
    private String nama;
    private int waktuPanen;
    private int kebutuhanAir;
    private int jumlah;
    private boolean sehat = true;
    private Random random;

    public Tanaman(String nm, int wp, int air, int jml) {
        nama = nm;
        waktuPanen = wp;
        kebutuhanAir = air;
        jumlah = jml;
        this.random = new Random();
    }

    public void setWaktuPanen(int wp) {
        waktuPanen = Math.max(0, wp);
    }

    public String getNama() {
        return nama;
    }
    public int getWaktuPanen() {
        return waktuPanen;
    }
    public int getKebutuhanAir() {
        return kebutuhanAir;
    }
    public int getJumlah() {
        return jumlah;
    }
    public boolean isSehat() {
        return sehat;
    }

    public void setSehat(boolean sehat) {
        this.sehat = sehat;
    }

    public void nowTumbuh(Waktu waktu) {
        if (sehat) {
            if (waktuPanen > 0) {
                waktuPanen--;
                System.out.println("Waktu panen tinggal "+waktuPanen+" hari");   
            }

            if (random.nextInt(10) < 3) {
                nowSakit();
            }
        } else {
            System.out.println("Tanaman siap dipanen");
        }
        cekKesehatanTanaman();
    }

    public void nowSakit() {
        sehat = false;
        System.out.println(nama+" kondisinya sakit dan tidak bisa tumbuh");
    }

    public void cekKesehatanTanaman() {
        Random random = new Random();
        if (random.nextBoolean()) {
            nowSakit();
        }
    }

    public void sembuh() {
        sehat = true;
        System.out.println(nama + " telah sembuh dan bisa tumbuh lagi.");
    }

    public void printTanaman() {
        System.out.println("Nama tanaman : "+nama);
        System.out.println("Kebutuhan air: "+kebutuhanAir);
        System.out.println("Waktu panen : "+waktuPanen);
    }

    public int percepatPanen(int time) {
        int waktuPanenBaru = waktuPanen - time;
        return waktuPanenBaru;
    }

    public int perlambatPanen(int time) {
        int waktuBertambah = waktuPanen + time;
        return waktuBertambah;
    }

    public void pengaruhiMusim(String musim) {
        
    }
}
