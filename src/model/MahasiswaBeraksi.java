package model;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa("19630382", "M Wahyudin Akbar", "31-07-2001");
        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " Tahun");

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa("19631234", "Pratama", "5-03-2003");
        mahasiswa2.tampilkanAtribut();
    }
}

