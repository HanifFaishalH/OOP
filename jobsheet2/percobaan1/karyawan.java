package jobsheet2.percobaan1;

public class karyawan {
    public int id;
    public String nama, jenis_kelamin, jabatan;
    public double gaji;

    public void printData() {
        System.out.println("Nomor ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("Jenis kelamin : "+jenis_kelamin);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Gaji : "+gaji);
    }
}
