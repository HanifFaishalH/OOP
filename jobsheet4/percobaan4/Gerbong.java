package jobsheet4.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (nomor > 0 && nomor <= arrayKursi.length) {
            if (arrayKursi[nomor-1].getPenumpang() == null) {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            } else {
                System.out.println("Kursi nomor "+nomor+" sudah ditempati.");
            }
        } else {
            System.out.println("Nomor kursi tidak valid");
        }
    }
        
        
}
