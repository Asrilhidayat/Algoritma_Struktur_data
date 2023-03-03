import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2;
        String operator;
        double hasil;

        System.out.print("Masukkan bilangan 1: ");
        bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bilangan2 = input.nextInt();
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        operator = input.next();

        switch (operator) {
            case "+":
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case "-":
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case "*":
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case "/":
                hasil = (double) bilangan1 / bilangan2;
                System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case "%":
                hasil = bilangan1 % bilangan2;
                System.out.println("Hasil modulus " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }
    }
}
