import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INPUT NAMA USER
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        //INPUT JENIS KELAMIN USER
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminStr = (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Laki-laki";

        //INPUT TANGGAL LAHIR USER
        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        //KONVERSI TL KE LOCAL DATE
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        //MENGHITUNG UMUR
        LocalDate tanggalSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggalSekarang);
        int umur = periode.getYears();

        // Output data diri
        System.out.println("\nData diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");
    }
}