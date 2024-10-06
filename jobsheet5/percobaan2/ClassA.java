package jobsheet5.percobaan2;

public class ClassA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getNilaiX() {
        return x;
    }
    public int getNilaiY() {
        return y;
    }

    public void getNilai() {
        System.out.println("Nilai X :"+x);
        System.out.println("Nilai Y :"+y);
    }
}
