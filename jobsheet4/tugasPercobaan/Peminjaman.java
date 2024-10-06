package jobsheet4.tugasPercobaan;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;

    Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        buku.setDipinjam(true);
    }

    public String info() {
        String info = "";
        info += "Nama Anggota: " + this.anggota.info(); 
        info += "Judul Buku: " + this.buku.info(); 
        info += "Tanggal pinjam: " + this.tanggalPinjam + "\n";
        return info;
    }
}