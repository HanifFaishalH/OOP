package UTS;


public class Toko {
    
    public void jualHasilPanen(Pemain pemain, int indeks, int harga) {
        if (pemain.getInventori().isEmpty()) {
            System.out.println("Tidak ada hasil panen untuk dijual. Inventori kosong.");
            return;
        }

        if (indeks >= 0 && indeks < pemain.getInventori().size()) {
            Tanaman tanamanTerjual = pemain.getInventori().remove(indeks);
            pemain.tambahUang(harga);
            System.out.println(tanamanTerjual.getNama() + " berhasil dijual dengan harga " + harga);
        } else {
            System.out.println("Indeks tidak valid. Tidak ada tanaman yang terjual.");
        }
    }
}
