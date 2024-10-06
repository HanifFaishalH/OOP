package jobsheet2.Tugas.Barang;

public class barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(int harga,float disc){
        float totalDiskon = harga*(disc/100);
        int hargaDiskon = (int) (harga - totalDiskon);
        return hargaDiskon;
    }

    public void tampilData() {
        System.out.println("Kode barang :"+kode);
        System.out.println("Nama barang :"+namaBarang);
        System.out.println("Harga barang :"+hargaDasar);
        System.out.println("Harga setelah diskon : "+hitungHargaJual(hargaDasar, diskon));
    }
}
