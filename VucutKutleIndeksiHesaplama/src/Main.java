import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double boy,VucutIndeksi;
       int kilo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz:");
        boy=scanner.nextDouble();

        System.out.println("Kilonuzu giriniz:");
        kilo=scanner.nextInt();

        VucutIndeksi=kilo/(boy*boy);
        System.out.printf("Vücut kitle İndeksiniz= %.2f dir",VucutIndeksi);
    }
}