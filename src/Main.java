import model.Mahasiswa;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19634321", "Dodoy", "07-08-2004");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());
    }
}
