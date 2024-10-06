package jobsheet2.Tugas.Lingkaran;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran round = new Lingkaran();
        round.pi = 3.14;
        round.r = 15;
        round.hitungLuas(round.r, round.pi);
        round.hitungKeliling(round.r, round.pi);
    }
}
