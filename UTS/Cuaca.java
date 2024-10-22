package UTS;

import java.util.*;

public class Cuaca {
    private int suhu;
    private String curahHujan;
    private int kelembaban;
    private Random random;

    public Cuaca() {
        random = new Random();
        ubahCuaca();
    }
    
    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    public void setCurahHujan(String ch) {
        curahHujan = ch;
    }
    public void setKelembaban(int lembab) {
        kelembaban = lembab;
    }
    
    public int getSuhu() {
        return suhu;
    }
    public String getCurahHujan() {
        return curahHujan;
    }
    public int getKelembaban() {
        return kelembaban;
    }

    public void ubahCuaca() {
        suhu = random.nextInt(35) + 5; 
        kelembaban = random.nextInt(100);

        int curahHujanRandom = random.nextInt(3);
        switch (curahHujanRandom) {
            case 0:
                curahHujan = "Rendah";
                break;
            case 1:
                curahHujan = "Sedang";
                break;
            case 2:
                curahHujan = "Tinggi";
                break;
            default:
                curahHujan = "Tidak ada";
        }

        System.out.println("Cuaca berubah: Suhu " + suhu + "°C, Curah hujan " + curahHujan + ", Kelembaban " + kelembaban + "%");
    }


    public void pengaruhiTanaman(Tanaman tanaman) {
        if (tanaman != null) {
            if (tanaman instanceof Tomat) {
                if (suhu < 15 || suhu > 30 || kelembaban < 50 || kelembaban > 80) {
                    tanaman.perlambatPanen(2);
                } else {
                    tanaman.percepatPanen(1);
                }
            } else if (tanaman instanceof Kentang) {
                if (suhu < 7 || suhu > 25 || kelembaban < 40 || kelembaban > 70) {
                    tanaman.perlambatPanen(3);
                } else {
                    tanaman.percepatPanen(1);
                }
            } else {
                System.out.println("Tanaman tidak ada, cuaca tidak berpengaruh");
            }
        }
    }

    public void cekCuaca() {
        System.out.println("Status cuaca hari ini: ");
        System.out.println("suhu: "+suhu +"°C");
        System.out.println("curah hujan: "+curahHujan);
        System.out.println("kelembaban: "+kelembaban+"%");
    }
}
