package jobsheet4.percobaan2;

public class mainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(35000);

        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(20000);

        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
