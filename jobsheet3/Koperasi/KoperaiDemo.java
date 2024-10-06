package jobsheet3.Koperasi;

public class KoperaiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan","Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp "+anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setorUang(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp "+anggota1.getSimpanan());

        anggota1.tarikTunai(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp "+anggota1.getSimpanan());
    }
}
