import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üs Alınacak Sayı: ");
        int taban = scanner.nextInt();

        System.out.print("Üs Olacak Sayı: ");
        int us = scanner.nextInt();

        int sonuc = (int) Math.pow(taban, us);

        System.out.println("Cevap: " + sonuc);
    }
}
