package jobsheet4.percobaan2;

public class Mobil {
    private String nama;
    private int biaya;

    Mobil(){

    }

    public void setMerk(String newnama) {
        nama = newnama;
    }
    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }
    
    public String getMerk() {
        return nama;
    }
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya*hari;
    }
}
