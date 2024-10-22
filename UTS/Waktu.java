package UTS;

import java.util.ArrayList;

public class Waktu {
    private String musim[] = {"Spring", "Summer", "Fall", "Winter"};
    private int hari = 1;
    private int indexMusim = 0;
    private String musimSekarang = musim[indexMusim];
    private int waktuSatuMusim = 28;

    public int getHari() {
        return hari;
    }

    public String getMusimSekarang() {
        return musimSekarang;
    }

    public void skipDay(ArrayList<Lahan> daftarLahan, Cuaca cuaca) {
        hari++;
        if (hari > waktuSatuMusim) {
            hari = 1;
            indexMusim = (indexMusim + 1) % musim.length;
            musimSekarang = musim[indexMusim];
            System.out.println("Musim berganti menjadi " + musimSekarang);
        }

        for (Lahan lahan : daftarLahan) {
            Tanaman tanaman = lahan.getTanaman();
            if (tanaman != null && tanaman.getWaktuPanen() > 0) {
                tanaman.setWaktuPanen(tanaman.getWaktuPanen() - 1);
                System.out.println("Waktu panen tinggal " + tanaman.getWaktuPanen() + " hari untuk " + tanaman.getNama());

                pengaruhiTanaman(tanaman);
                tanaman.pengaruhiMusim(musimSekarang);

                // Jika tanaman sudah bisa dipanen
                if (tanaman.getWaktuPanen() == 0) {
                    System.out.println("Tanaman " + tanaman.getNama() + " siap dipanen!");
                }
            }
        }
    }
    

    public void pengaruhiTanaman(Tanaman tanaman) {
        if (tanaman instanceof Tomat) {
            ((Tomat) tanaman).pengaruhiMusim(musimSekarang);
        } else if (tanaman instanceof Kentang) {
            ((Kentang) tanaman).pengaruhiMusim(musimSekarang);
        } else {
            System.out.println("Tanaman tidak ada, cuaca tidak berpengaruh");
        }
    }
    
    public void printCuaca() {
        System.out.println("Tanggal: "+hari);
        System.out.println("Musim: "+musimSekarang);
    }
}
