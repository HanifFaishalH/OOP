package jobsheet2.percobaan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia no 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Wahyu";
        mhs2.alamat = "Jl. Jerman 2D no 54";
        mhs2.kelas = "2E";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Dino";
        mhs3.alamat = "Kompleks Candra Kirana";
        mhs3.kelas = "3C";
        mhs3.tampilBiodata();
    }
}
