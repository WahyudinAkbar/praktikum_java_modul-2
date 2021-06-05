import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "M";
        String namaTengah = "Wahyudin";
        String namaBelakang = "Akbar";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.78;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan + " " + namaTengah + " " + namaBelakang);

        char[] wahyuChar = {'W', 'A', 'H', 'Y', 'U'};
        String wahyuString = new String(wahyuChar);
        System.out.println(wahyuString);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;

        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("Wah"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5, 12));
        System.out.println(namaLengkap.replace("M", "Muhammad"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));
    }
}
