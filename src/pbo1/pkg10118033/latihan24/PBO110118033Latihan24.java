
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk membandingkan dua buah
 * nilai
 *  
 */

package pbo1.pkg10118033.latihan24;

import java.util.Scanner;

public class PBO110118033Latihan24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang = "Ya";
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukkan Nilai Pertama : ");
            int i = scanner.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            int j = scanner.nextInt();
            if (i > j) {
                System.out.println("Hasil : " + i + " Lebih besar dari " + j);
            } else if (i < j) {
                System.out.println("Hasil : " + i + " Lebih kecil dari " + j);
            } else if (i == j) {
                System.out.println("Hasil : " + i + " Sama dengan " + j);
            }
            System.out.print("\nUlangi Aktifitas? (Ya/Tidak) : ");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("Ya"));
        System.out.println("(Developed By : Ikrar AB)");
    }
}