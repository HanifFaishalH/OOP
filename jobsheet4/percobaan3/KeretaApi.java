package jobsheet4.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String nm, String kls, Pegawai msns, Pegawai asist) {
        this.nama = nm;
        this.kelas = kls; 
        this.masinis = msns;
        this.asisten = asist;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }
    public void setKelas(String newKelas) {
        kelas = newKelas;
    }
    public void setMasinis(Pegawai newMasinis) {
        masinis = newMasinis;
    }
    public void setAsisten(Pegawai newAsisten) {
        asisten = newAsisten;
    }
    
    public String getNama() {
        return nama;
    }
    public String getKelas() {
        return kelas;
    }
    public Pegawai getMasinis() {
        return masinis;
    }
    public Pegawai getAsisten() {
        return asisten;
    }

    public String info () {
        String info = "";
        info += "Nama: " + this.nama +"\n";
        info += "Kelas: " + this.kelas +"\n";
        info += "Masinis: " + this.masinis.info() +"\n";
        info += "Asisten: " + this.asisten.info() +"\n";
        return info;
    }
}
