import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean isPalindrom = isPalindrom(sayi);

        if (isPalindrom) {
            System.out.println("Girilen sayı bir palindrom sayıdır.");
        } else {
            System.out.println("Girilen sayı bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrom(int sayi) {
        int originalSayi = sayi;
        int reverseSayi = 0;

        while (sayi != 0) {
            int kalan = sayi % 10;
            reverseSayi = reverseSayi * 10 + kalan;
            sayi /= 10;
        }

        return originalSayi == reverseSayi;
    }
}
