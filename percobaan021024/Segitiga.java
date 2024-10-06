package percobaan021024;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float hitungLuas() {
        return (alas*tinggi)/2;
    }

    @Override
    public float hitungKeliling() {
        float miring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float keliling = alas+tinggi+miring;
        return keliling;
    }
}
