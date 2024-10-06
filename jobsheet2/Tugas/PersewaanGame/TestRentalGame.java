package jobsheet2.Tugas.PersewaanGame;

public class TestRentalGame {
    public static void main(String[] args) {
        GameRental gr1 = new GameRental();
        gr1.id = 1;
        gr1.namaMemb = "Mustafa";
        gr1.namaGame = "EA FC 25";
        gr1.harga = 50000;

        gr1.printTransaction();
        gr1.printPayment(5);
    }
}
