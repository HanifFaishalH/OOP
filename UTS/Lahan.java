package UTS;

public class Lahan {
    private int ukuran;
    private String jenisTanah;
    private Tanaman tanaman;
    private String metodeTanam;
    private Waktu waktu;

    public Lahan(int size, String jnsTnh, String mt) {
        ukuran = size;
        jenisTanah = jnsTnh;
        metodeTanam = mt;
        waktu = new Waktu();
    }

    public int getUkuran() {
        return ukuran;
    }
    public String getJenisTanah() {
        return jenisTanah;
    }
    public Tanaman getTanaman() {
        return tanaman;
    }
    public String getMetodeTanam() {
        return metodeTanam;
    }

    public void menanamTanaman(Tanaman plant) {
        tanaman = plant;
        System.out.println(tanaman.getNama()+" ditanam di lahan  "+getJenisTanah()+" berukuran "+getUkuran()+" dengan metode "+metodeTanam);
    }

    public void menyiramTanaman() {
        if (tanaman != null) {
            System.out.println("Menyiram tanaman "+tanaman.getNama()+" dengan "+tanaman.getKebutuhanAir()+" liter");
        } else {
            System.out.println("Tidak ada tanaman yang ditanam di lahan ini");
        }
    }

    public void memupukTanaman(int timeReduction) {
        if (tanaman != null) {
            System.out.println("Memupuk " + tanaman.getNama());
            int waktuPanenBaru = tanaman.getWaktuPanen() - timeReduction;
            tanaman.setWaktuPanen(waktuPanenBaru);
            tanaman.setSehat(true);
            System.out.println("Waktu panen " + tanaman.getNama() + " dipercepat menjadi " + tanaman.getWaktuPanen() + " hari dan tanaman menjadi sehat.");
        } else {
            System.out.println("Tidak ada tanaman yang ditanam di lahan ini");
        }
    }
    

    public void infoCuaca() {
        waktu.printCuaca();
        if (tanaman != null) {
            waktu.pengaruhiTanaman(tanaman);
            if (!tanaman.isSehat()) {
                System.out.println(tanaman.getNama()+" tidak sehat karena kondisi cuaca");
            } else {
                System.out.println(tanaman.getNama()+ " sehat");
            }
        }
    }

    public Tanaman panenTanaman() {
        if (tanaman != null && tanaman.getWaktuPanen() <= 0 && tanaman.isSehat()) {
            System.out.println(tanaman.getNama()+" telah dipanen!");
            Tanaman hasilPanen = tanaman;
            tanaman = null;
            System.out.println("Tanaman " + hasilPanen.getNama() + " berhasil dipanen.");
            return hasilPanen;
        } else {
            System.out.println("Tanaman belum siap dipanen");
            return null;
        }
    }

    public void hapusTanaman() {
        if (tanaman != null) {
            System.out.println(tanaman.getNama() + " berhasil dipanen dari lahan " + getJenisTanah() + " berukuran " + getUkuran());
            tanaman = null; 
        } else {
            System.out.println("Tidak ada tanaman yang dapat dipanen di lahan ini.");
        }
    }

    @Override
    public String toString() {
        if (tanaman != null) {
            return "Lahan [Ukuran: " + ukuran + ", Jenis Tanah: " + jenisTanah + ", Tanaman: " + tanaman.getNama() + ", Waktu Panen: " + tanaman.getWaktuPanen() + " hari]";
        } else {
            return "Lahan [Ukuran: " + ukuran + ", Jenis Tanah: " + jenisTanah + ", Tanaman: Tidak ada]";
        }
    }
}
