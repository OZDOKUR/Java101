import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Negatif bir sayı girene kadar sayılarınızı girin:");

        while (true) {
            int sayi = scanner.nextInt();

            if (sayi < 0) {
                break;
            }

            if (sayi % 2 == 1) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen tek sayıların toplamı: " + toplam);
    }


}