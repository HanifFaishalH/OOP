package OOP.Praktikum;

public class Demo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        smartphone ph = new smartphone();
        Android ad = new Android();
        Apple ap = new Apple();

        mobil1.setNama("Aventador");
        mobil1.setMerek("Lamborgini");
        mobil1.setHarga(300000000);
        mobil1.status();

        System.out.println();

        ph.setNama("Iqoo Z9");
        ph.setBrand("Vivo");
        ph.setOS("Android");
        ph.status();

        System.out.println();

        ad.setNama("Poco F6");
        ad.setBrand("Poco");
        ad.setOS("HyperOS");
        ad.setVersi("14");
        ad.setChipset("Snapdragon 8s Gen 3");
        ad.statCheck();
        
        System.out.println();

        ap.setNama("Apple 13 Pro Max");
        ap.setBrand("Apple");
        ap.setOS("IOS 15");
        ap.setChipset("A15 Bionic");
        ap.setKondisi("Ex-Inter");
        ap.statCheck();
    }
}
