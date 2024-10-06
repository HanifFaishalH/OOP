package jobsheet4.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    Sopir() {

    }

    public void setNama(String newnama) {
        nama = newnama;
    }
    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }
    
    public String getNama() {
        return nama;
    }
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya*hari;
    }
}
