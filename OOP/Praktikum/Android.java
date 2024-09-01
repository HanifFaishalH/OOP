package OOP.Praktikum;

public class Android extends smartphone {
    private String versi;
    private String chipset;

    public void setVersi(String value) {
        versi = value;
    }

    public void setChipset(String value) {
        chipset = value;  
    }

    public void statCheck() {
        super.status();
        System.out.println("Android versi : " + versi);
        System.out.println("Chipset : " + chipset);
    }
}
