import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yariCap;
        double pi=3.14,alan,cevre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz");
        yariCap = scanner.nextInt();

        alan= pi * yariCap * yariCap;
        cevre=2 * pi * yariCap;

        System.out.printf("Alanı %.2f dir",alan);
        System.out.println();
        System.out.printf("Çevresi %.2f dir",cevre);

    }
}