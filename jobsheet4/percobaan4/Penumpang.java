package jobsheet4.percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtp(String newKtp) {
        ktp = newKtp;
    }
    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getKtp() {
        return ktp;
    }
    public String getNama() {
        return nama;
    }
    public String info() {
        String info = "";
        info += "KTP: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
