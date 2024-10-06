package jobsheet4.tugasPercobaan;

public class Buku {
    private String judul;
    private String penulis;
    private String kode;
    private boolean status;

    Buku(String judul, String penulis, String kode) {
        this.judul = judul;
        this.penulis = penulis;
        this.kode = kode;
        this.status = false; // Buku tersedia saat dibuat
    }

    public void setJudul(String newJudul) {
        judul = newJudul;
    }
    public void setPenulis(String newPenulis) {
        penulis = newPenulis;
    }
    public void setKode(String newKode) {
        kode = newKode;
    }

    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public String getKode() {
        return kode;
    }

    public boolean isDipinjam() {
        return status;
    }

    public void setDipinjam(boolean status) {
        this.status = status;
    }

    public String info() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Kode: " + kode + ", Status: " + (status ? "Dipinjam" : "Tersedia");
    }
}

