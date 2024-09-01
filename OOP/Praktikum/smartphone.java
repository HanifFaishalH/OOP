package OOP.Praktikum;

public class smartphone {
    private String nama;
    private String brand;
    private String OS;

    public void setNama(String value) {
        nama = value;
    }

    public void setBrand(String value) {
        brand = value;
    }

    public void setOS(String value) {
        OS = value;
    }

    public void status() {
        System.out.println("Nama : " + nama);
        System.out.println("Brand : " + brand);
        System.out.println("Operating System : " + OS);
    }
}
