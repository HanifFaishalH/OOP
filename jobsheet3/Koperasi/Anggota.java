package jobsheet3.Koperasi;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan () {
        return simpanan;
    }

    public void setorUang(float uang) {
        simpanan += uang;
    }

    public void tarikTunai(float uang) {
        simpanan -= uang;
    }
}
