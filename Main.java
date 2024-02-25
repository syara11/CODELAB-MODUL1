import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INPUT NAMA USER
        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        //IMPUT JENIS KELAMIN USER
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminStr = (jenisKelamin == 'P' || jenisKelamin == 'P') ? "Perempuan" : "Laki-laki";

        //INPUT TANGGAL LAHIR
        System.out.print("Masukkan tanggal lahir anda (yyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        //KONVERSI TL KE LOCAL DATE
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        //HITUNG UMUR
        LocalDate tanggalSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggalSekarang);
        int umur = periode.getYears();

        //OUTPUT DARI DATA DIRI
        System.out.println("\nData diri anda:");
        System.out.println("Nama:" + nama);
        System.out.println("Jenis kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun ");

    }
}
