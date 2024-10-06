package jobsheet2.Tugas.PersewaanGame;

public class GameRental {
    public int id;
    public String namaMemb, namaGame;
    public double harga;

    public void printTransaction() {
        System.out.println("ID transaksi : "+id);
        System.out.println("Nama Pelanggan : "+namaMemb);
        System.out.println("Judul game : "+namaGame);
        System.out.println("Harga sewa/hari : "+harga);
    }

    public double printPayment(double hari) {
        double total = hari*harga;
        System.out.println("Waktu sewa :"+hari+" hari");
        System.out.println("Total biaya sewa : "+total);
        return total;
    }
}
