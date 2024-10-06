package jobsheet2.Tugas.Lingkaran;

public class Lingkaran {
    public double pi;
    public double r;

    public double hitungLuas(double jari2, double phi) {
        double luas = phi*jari2*jari2;
        System.out.println("Luas lingkaran adalah : "+luas);
        return luas;
    }
    
    public double hitungKeliling(double jari2, double phi) {
        double keliling = 2*phi*jari2;
        System.out.println("Keliling lingkaran adalah : "+keliling);
        return keliling;
    }
}
