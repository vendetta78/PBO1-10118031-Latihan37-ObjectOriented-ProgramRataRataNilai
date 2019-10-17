package pbo1.pkg10118031.latihan37.objectoriented.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program Rata Rata Nilai
 */
public class PBO110118031Latihan37ObjectOrientedProgramRataRataNilai {

    public static void main(String[] args) {

        Mahasiswa mah = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
        System.out.println("Developed by : Rizki Aria Putra");
    }

}
