package UTS;

public class Kentang extends Tanaman {
    private int jumlah;

    public Kentang(String nm, int wp, int air, int jmlh) {
        jumlah = jmlh;
        super("Kentang", wp, air, jmlh);
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public void printTanaman() {
        super.printTanaman();
        System.out.println("Jumlah yang ditanam: " + getJumlah());
        System.out.println();
    }

    public void pengaruhiCuaca(Cuaca cuaca) {
        if (cuaca.getSuhu() < 10 || cuaca.getSuhu() > 25) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena suhu tidak ideal (" + cuaca.getSuhu() + "°C)");
        } else if (cuaca.getKelembaban() < 60 || cuaca.getKelembaban() > 90) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena kelembaban tidak ideal (" + cuaca.getKelembaban() + "%)");
        }

        if ("rendah".equals(cuaca.getCurahHujan())) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena curah hujan terlalu rendah");
        }

        if (isSehat()) {
            System.out.println(getNama() + " tetap sehat dengan kondisi cuaca saat ini.");
        }
    }

    public void pengaruhiMusim(String musim) {
        if ("Summer".equalsIgnoreCase(musim)) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat di musim " + musim);
        }

        if (isSehat() && getWaktuPanen() > 0) {
            System.out.println(getNama() + " tumbuh dengan baik di musim " + musim);
            percepatPanen(getWaktuPanen()-1);
            System.out.println("Waktu panen " + getNama() + " berkurang menjadi " + getWaktuPanen() + " hari");
        }
    }
}
