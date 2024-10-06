package jobsheet2.percobaan3;

public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;

    public void tampiBarang() {
        System.out.println("Nama Barang : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok : "+stok);
    }

    public int tambahStok(int brgMasuk) {
        int stokBaru =  brgMasuk+stok;
        return stokBaru;
    }
}
