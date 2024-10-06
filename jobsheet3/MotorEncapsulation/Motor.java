package jobsheet3.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private int kecepatanMax = 100;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak on");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }

    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn==true) {
            if (kecepatan + 5>= kecepatanMax) {
                kecepatan = kecepatanMax;
                System.out.println("Kecepatan motor sudah maksimal");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn==true) {
            kecepatan-=5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
}
