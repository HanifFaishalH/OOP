package jobsheet4.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String newNomor) {
        nomor = newNomor;
    }
    public void setPenumpang(Penumpang newPen) {
        penumpang = newPen;
    }

    public String getNomor() {
        return nomor;
    }
    public Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
        }        
}
