import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai huruf: A");
        } else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai huruf: B");
        } else if (nilai >= 65 && nilai <= 74) {
            System.out.println("Nilai huruf: C");
        } else if (nilai >= 55 && nilai <= 64) {
            System.out.println("Nilai huruf: D");
        } else if (nilai < 55) {
            System.out.println("Nilai huruf: E");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}