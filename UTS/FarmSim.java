package UTS;

import java.util.Scanner;
import java.util.ArrayList;

public class FarmSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Waktu waktu = new Waktu();
        Cuaca cuaca = new Cuaca();

        Pemain pemain = new Pemain("Farmer", 0, 100);

        ArrayList<Lahan> daftarLahan = new ArrayList<>();

        System.out.println("Prolog: ");
        System.out.println("Kamu adalah seorang pemuda yang susah mencari kerja. Suatu hari, kakekmu meninggal dunia. Kakek memberikan pesan kepada keluarganya untuk mengurus pertaniannya. Karena mengetahui kamu sedang kesulitan mencari pekerjaan, pamanmu memintamu untuk mengurusi lahan pertanian kakek. Dengan persetujuan orang tua, kamu berangkat ke desa menuju rumah kakek.");
        System.out.println();
        System.out.println("Setelah sampai, kamu menemukan banyak barang peninggalan kakek. Salah satunya bibit tomat dan kentang yang sangat banyak. Karena kamu Sarjana Pertanian, kamu paham apa yang harus kamu lakukan dengan barang tersebut.");
        
        boolean running = true;
        while (running) {
            menu();
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("1. Tanam tanaman");
                    System.out.println("2. Siram tanaman");
                    System.out.println("3. Beri Pupuk");
                    System.out.println("4. Panen");
                    System.out.print("Pilih opsi: ");
                    int pilih = sc.nextInt();

                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan nama bibit tanaman (Tomat/Kentang): ");
                            String namaTanaman = sc.next();
                            System.out.print("Masukkan waktu panen: ");
                            int waktuPanen = sc.nextInt();
                            System.out.print("Kebutuhan air:  ");
                            int kebutuhanAir = sc.nextInt();
                            System.out.print("Jumlah bibit:  ");
                            int jumlah  = sc.nextInt();

                            System.out.println("Masukkan ukuran lahan:");
                            int ukuran = sc.nextInt();
                            sc.nextLine(); 
                            System.out.println("Masukkan jenis tanah:");
                            String jenisTanah = sc.nextLine();
                            System.out.println("Masukkan metode tanam:");
                            String metodeTanam = sc.nextLine();

                            if (namaTanaman.equalsIgnoreCase("Kentang")) {
                                Kentang kentang = new Kentang(namaTanaman, waktuPanen, kebutuhanAir, jumlah);
                                Lahan lahanKentang = new Lahan(ukuran, jenisTanah, metodeTanam);
                                lahanKentang.menanamTanaman(kentang);
                                daftarLahan.add(lahanKentang);
                            } else if (namaTanaman.equalsIgnoreCase("Tomat")) {
                                Tomat tomat = new Tomat(namaTanaman, waktuPanen, kebutuhanAir, jumlah);
                                Lahan lahanTomat = new Lahan(ukuran, jenisTanah, metodeTanam);
                                lahanTomat.menanamTanaman(tomat);
                                daftarLahan.add(lahanTomat);
                            }

                            pemain.kurangiEnergi(30);
                            break;

                        case 2:
                            if (pemain.getEnergi() <  10) {
                                System.out.println("Energi tidak cukup untuk menyiram");
                                break;
                            } 
                            tampilkanLahan(daftarLahan);
                            System.out.println("Pilih lahan yang mau disiram : ");
                            int lahanIndex = sc.nextInt()-1;

                            if (isValidLahanIndex(lahanIndex, daftarLahan)) {
                                daftarLahan.get(lahanIndex).menyiramTanaman();
                                pemain.kurangiEnergi(20);
                            } else {
                                System.out.println("Lahan yang dipilih tidak valid");
                            }
                            break;

                        case 3:
                            if (pemain.getEnergi() <  10) {
                                System.out.println("Energi tidak cukup untuk memberi pupuk");
                                break;
                            } 

                            System.out.println("Beri pupuk ke lahan ke berapa?");
                            int indexLahanPupuk = sc.nextInt()-1;
                            sc.nextLine();
                            if (indexLahanPupuk >= 0 && indexLahanPupuk < daftarLahan.size()) {
                                Lahan lahan = daftarLahan.get(indexLahanPupuk);
                                lahan.memupukTanaman(2);
                                if (lahan.getTanaman().getWaktuPanen() < 0) {
                                    lahan.getTanaman().setWaktuPanen(0);
                                }
                                pemain.kurangiEnergi(10);
                            } else {
                                System.out.println("Indeks lahan tidak valid.");
                            }
                            break;
                        case 4:
                            System.out.println("Panen tanaman di lahan ke berapa?");
                            int indexLahanPanen = sc.nextInt()-1;
                            sc.nextLine();
                            if (indexLahanPanen >= 0 && indexLahanPanen < daftarLahan.size()) {
                                Lahan lahan = daftarLahan.get(indexLahanPanen);
                                if (lahan.getTanaman() != null && lahan.getTanaman().getWaktuPanen() <= 0) {
                                    pemain.tambahHasilPanen(lahan.getTanaman());
                                    lahan.hapusTanaman();
                                    System.out.println("Tanaman berhasil dipanen.");
                                    pemain.kurangiEnergi(10);
                                } else {
                                    System.out.println("Tanaman belum siap dipanen.");
                                }
                            } else {
                                System.out.println("Indeks lahan tidak valid.");
                            }
                            break;
                            
                        default:
                            break;
                    }
                    break;
                case 2:
                    if (daftarLahan.isEmpty()) {
                        System.out.println("Tidak ada lahan yang ditanami");
                    } else {
                        for (int i = 0; i < daftarLahan.size(); i++) {
                            Lahan lahan = daftarLahan.get(i);
                            Tanaman tanaman = lahan.getTanaman();

                            if (tanaman != null) {
                                System.out.println("Lahan " + (i + 1) + ": " + tanaman.getNama());
                                System.out.println("  Waktu panen: " + tanaman.getWaktuPanen() + " hari");
                                System.out.println("  Kesehatan: " + (tanaman.isSehat() ? "Sehat" : "Sakit"));
                                System.out.println("  Kebutuhan Air: " + tanaman.getKebutuhanAir());
                            } else {
                                System.out.println("Lahan " + (i + 1) + " tidak memiliki tanaman.");
                            }
                        }
                        cuaca.cekCuaca();
                    }
                    break;
                case 3:
                    System.out.println("1. Lihat inventory");
                    System.out.println("2. Jual hasil panen");
                    int pilihanToko = sc.nextInt();

                    if (pemain.getInventori() == null) {
                        pemain.lihatInventori();
                        break;
                    } else {
                        if (pilihanToko == 1) {
                            pemain.lihatInventori();
                        } else if (pilihanToko == 2) {
                            pemain.lihatInventori();
                            System.out.println("Pilih indeks tanaman yang ingin dijual: ");
                            int indeks = sc.nextInt();
                            System.out.println("Masukkan harga jual: ");
                            int harga = sc.nextInt();
                            pemain.jualHasilPanen(indeks, harga);
                        }
                    }
                    break;
                case 4:
                    pemain.cekStatusPemain();
                    break;
                case 5:
                    waktu.skipDay(daftarLahan, cuaca);
                    for (Lahan lahan : daftarLahan) {
                        Tanaman tanaman = lahan.getTanaman();
                        if (tanaman != null) {
                            cuaca.pengaruhiTanaman(tanaman);
                            tanaman.nowTumbuh(waktu);
                        }
                    }
                    pemain.resetEnergi();
                    break;
                case 6:
                    System.out.println("Sampai jumpa!");
                    running = false;
                    sc.close();
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n Selamat datang di Farming Simulator Java!");
        System.out.println("1. Kelola lahan");
        System.out.println("2. Status tanaman");
        System.out.println("3. Toko");
        System.out.println("4. Status Pemain");
        System.out.println("5. Tidur");
        System.out.println("6. Keluar");
    }

    public static void tampilkanLahan(ArrayList<Lahan> daftarLahan) {
        System.out.println("Daftar lahan yang tersedia:");
        for (int i = 0; i < daftarLahan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarLahan.get(i));
        }
    }

    public static boolean isValidLahanIndex(int index, ArrayList<Lahan> daftarLahan) {
        return index >= 0 && index < daftarLahan.size();
    }
}
