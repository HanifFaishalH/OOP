package OOP.Praktikum;

public class Apple extends smartphone {
    private String chipset;
    private String kondisi;

    public void setChipset(String value) {
        chipset = value;
    }

    public void setKondisi(String value) {
        kondisi = value;  
    }

    public void statCheck() {
        super.status();
        System.out.println("Status Barang : " + chipset);
        System.out.println("kondisi : " + kondisi);
    }
}
