package jobsheet4.tugasPercobaan;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;

    Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String info() {
        String info = "";
        info += "ID Anggota: " + this.idAnggota + "\n";
        info += "Nama: " + this.nama + "\n";
        info += "Alamat: " + this.alamat + "\n";
        return info;
    }
}
