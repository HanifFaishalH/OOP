package percobaan021024;

public class Lingkaran extends BangunDatar{
    private float r;

    public Lingkaran(float jr) {
        r = jr;
    }

    @Override
    public float luas() {
        return (float) (Math.PI *r*r);
    }
    @Override
    public float keliling() {
        return (float) (2 * Math.PI *r);
    }
}
