package percobaan021024;

class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;

    PersegiPanjang(float pj, float lb) {
        panjang = pj;
        lebar = lb;
    }

    @Override
    public float hitungLuas() {
        return panjang*lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2* (panjang+lebar);
    }
}