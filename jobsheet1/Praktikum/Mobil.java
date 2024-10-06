package Praktikum;

public class Mobil {
    private String nama;
    private String merek;
    private int harga;

    public void setNama(String value) {
        nama = value;
    }

    public void setHarga(int value) {
        harga = value;
    }

    public void setMerek(String value) {
        merek = value;
    }

    public void status() {
        System.out.println("Nama : " + nama);
        System.out.println("Merek : " + merek);
        System.out.println("Harga : " + harga);
    }
};