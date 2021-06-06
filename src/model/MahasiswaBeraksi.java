package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630382";
        mahasiswa.nama = "M Wahyudin Akbar";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("31-07-2001");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " Tahun");

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19631234";
        mahasiswa2.nama = "Akbar";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        mahasiswa2.tampilkanAtribut();
    }
}

