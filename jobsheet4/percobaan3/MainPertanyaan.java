package jobsheet4.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai masinis2 = new Pegawai("2345", "Budiono Siregar");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, masinis2);
        System.out.println(keretaApi.info());
    }
}
