import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int basamakSayisi = 0;
        int tempSayi = sayi;

        // Sayının basamak sayısını bulma
        while (tempSayi != 0) {
            tempSayi /= 10;
            basamakSayisi++;
        }

        System.out.println("Sayının basamak sayısı: " + basamakSayisi);
    }
}
