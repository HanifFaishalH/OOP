package jobsheet4.percobaan2;

public class Pelanggan {
    private String nama;
    private int hari;
    private Sopir sopir;
    private Mobil mobil;

    Pelanggan() {

    }

    public void setNama(String newnama) {
        nama = newnama;
    }
    public void setHari(int newHari) {
        hari = newHari;
    }
    public void setMobil(Mobil newMobil) {
        mobil = newMobil;
    }
    public void setSopir(Sopir newSopir) {
        sopir = newSopir;
    }
    
    public String getNama() {
        return nama;
    }
    public int getHari() {
        return hari;
    }
    public Mobil getMobil() {
        return mobil;
    }
    public Sopir getSopir() {
        return sopir;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
