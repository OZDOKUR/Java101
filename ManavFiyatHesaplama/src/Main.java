import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,tutar;
        int sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldınız");
        sayi= scanner.nextInt();
        armut=sayi*armut;

        System.out.println("Kaç kilo elma aldınız");
        sayi= scanner.nextInt();
        elma=sayi*elma;

        System.out.println("Kaç kilo domates aldınız");
        sayi= scanner.nextInt();
        domates=sayi*domates;

        System.out.println("Kaç kilo muz aldınız");
        sayi= scanner.nextInt();
        muz=sayi*muz;

        System.out.println("Kaç kilo patlıcan aldınız");
        sayi= scanner.nextInt();
        patlican=sayi*patlican;

        tutar=armut+elma+domates+muz+patlican;

        System.out.printf("Toplam tutar %.2f TL dir",tutar);
    }
}