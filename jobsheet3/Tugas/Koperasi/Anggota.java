package jobsheet3.Tugas.Koperasi;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private float pinjaman;

    Anggota(String nama, String nomorAnggota, float pinjaman) {
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
        this.pinjaman = pinjaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorAnggota(String nomor) {
        nomorAnggota = nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getnomorAnggota() {
        return nomorAnggota;
    }

    public float getPinjaman () {
        return pinjaman;
    }

    public void bayarAngsuran(float uang) {
        if (uang >= 0.1*pinjaman) {
            pinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran minimal 10% dari jumlah pinjaman");
        }
    }

    public void pinjamUang(float uang) {
        if (uang < pinjaman) {
            pinjaman = uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
}
