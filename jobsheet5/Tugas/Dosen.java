package jobsheet5.Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private int tarif_SKS;

    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarif_SKS) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.tarif_SKS = tarif_SKS;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * tarif_SKS;
    }

    public void printInfo() {
        System.out.println("NIP: " + getNip() + ", Nama: " + getNama() + ", Gaji: " + getGaji());
    }
}
