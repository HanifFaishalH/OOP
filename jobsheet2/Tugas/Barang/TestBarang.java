package jobsheet2.Tugas.Barang;

public class TestBarang {
    public static void main(String[] args) {
        barang brg1 = new barang();
        brg1.kode = "Minuman";
        brg1.namaBarang = "Susu UHT 1L";
        brg1.hargaDasar = 20000;
        brg1.diskon = 10;

        brg1.tampilData();
    }
}
