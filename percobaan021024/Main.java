package percobaan021024;

public class Main {
    public static void main(String[] args) {
        // Create instances of each shape
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        Lingkaran l = new Lingkaran(4);
        Segitiga s = new Segitiga(3, 4);

        // Display the area and perimeter of each shape
        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());

        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + l.hitungLuas());
        System.out.println("Keliling: " + l.hitungKeliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + s.hitungLuas());
        System.out.println("Keliling: " + s.hitungKeliling());
    }

}
