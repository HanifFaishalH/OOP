package jobsheet5.Tugas;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat; 
    }

    public String getNama() {
        return this.nama;
    }
    public String getAlamat() {
        return this.alamat;
    }

    public String getNip() {
        return this.nip; 
    }

    public int getGaji() {
        return 0;
    }
}
