import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Değerini Giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Sınır Değerini Giriniz: ");
        int sinir = scanner.nextInt();

        System.out.println(n + "'nin kuvvetleri:");

        int kuvvet = 1;
        for (int i = 1; kuvvet <= sinir; i++) {
            System.out.println(kuvvet);
            kuvvet *= n;
        }
    }
}
