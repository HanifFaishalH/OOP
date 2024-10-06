package jobsheet4.tugasPercobaan;

public class MainPerpus {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kota");

        Buku buku1 = new Buku("Buku A", "Penulis A", "001");
        Buku buku2 = new Buku("Buku B", "Penulis B", "002");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Anggota anggota1 = new Anggota("A001", "Ali", "Jalan 1");
        Anggota anggota2 = new Anggota("A002", "Budi", "Jalan 2");
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        perpustakaan.pinjamBuku(anggota1, buku1, "2024-09-27");
        perpustakaan.pinjamBuku(anggota2, buku1, "2024-09-28"); // Coba pinjam buku yang sama

        System.out.println(perpustakaan.info());
    }
}

