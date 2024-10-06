package jobsheet3.Tugas.Koperasi;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("Donny", "111333444", 5000000);

        System.out.println("Nama anggota: " + donny.getNama());
        System.out.println("Limit pinjaman: " + donny.getPinjaman());

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Pinjam uang");
            System.out.println("2. Bayar angsuran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah uang yang ingin dipinjam: ");
                    float jumlahPinjaman = scan.nextFloat();
                    donny.pinjamUang(jumlahPinjaman);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran: ");
                    float jumlahAngsuran = scan.nextFloat();
                    donny.bayarAngsuran(jumlahAngsuran);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjaman());
        }
    }
}
