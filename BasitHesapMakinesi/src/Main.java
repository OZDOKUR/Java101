import java.util.Scanner;
//Döngü olmadan tek bir tane hata veren ve bölme işleminde try-catch-finally kullanılmayan en basit hesap makinesi
public class Main {
    public static void main(String[] args) {
        int secim,sayi1,sayi2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk Sayıyı Gir: ");
        sayi1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Gir: ");
        sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğin işlemi seç:\n 1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        secim=scanner.nextInt();

        switch (secim) {
            case 1 -> System.out.println(sayi1+sayi2);
            case 2 -> System.out.println(sayi1-sayi2);
            case 3 -> System.out.println(sayi1*sayi2);
            case 4 -> System.out.println(sayi1/sayi2);
            default -> System.out.println("1, 2, 3 veya 4 ü seçmen lazım");
        }
    }
}