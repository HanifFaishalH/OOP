package UTS;

public class Tomat extends Tanaman {
    private int jumlah;

    public Tomat(String nm, int wp, int air, int jmlh) {
        jumlah = jmlh;
        super("Tomat", wp, air, jmlh);
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
        // Jika suhu tidak sesuai atau kelembaban tidak sesuai, tanaman menjadi tidak sehat
        if (cuaca.getSuhu() < 15 || cuaca.getSuhu() > 30) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena suhu tidak ideal (" + cuaca.getSuhu() + "°C)");
        } else if (cuaca.getKelembaban() < 50 || cuaca.getKelembaban() > 80) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena kelembaban tidak ideal (" + cuaca.getKelembaban() + "%)");
        }

        if ("tinggi".equals(cuaca.getCurahHujan())) {
            setSehat(false);
            System.out.println(getNama() + " tidak sehat karena curah hujan terlalu tinggi");
        }

        if (isSehat()) {
            System.out.println(getNama() + " tetap sehat dengan kondisi cuaca saat ini.");
        }
    }

    public void pengaruhiMusim(String musim) {
        
        if ("Winter".equalsIgnoreCase(musim)) {
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
