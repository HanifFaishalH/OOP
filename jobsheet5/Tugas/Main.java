package jobsheet5.Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji();

        Dosen dosen1 = new Dosen("123", "Budiono Siregar", "Jalan Anggrek No. 14", 20, 200000);
        Dosen dosen2 = new Dosen("123", "Rusdi Suardi", "Jalan Ngawi No.14", 16, 300000);

        dg.addPegawai(dosen1);
        dg.addPegawai(dosen2);

        dg.printSemuagaji();
    }
}
