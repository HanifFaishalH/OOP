package jobsheet5.Tugas;

import java.util.ArrayList;

public class DaftarGaji {
    private ArrayList<Pegawai> listPegawai;

    DaftarGaji() {
        listPegawai = new ArrayList<>();
    }

    public void addPegawai(Pegawai p) {
        listPegawai.add(p);
    }

    public void printSemuagaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println("NIP: " + pegawai.getNip());
                System.out.println("Nama: " + pegawai.getNama());
                System.out.println("Alamat: " + pegawai.getAlamat());
                System.out.println("Gaji: "+pegawai.getGaji());
            }
        }
    }
}
