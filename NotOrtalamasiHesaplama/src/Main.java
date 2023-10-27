import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        double finalNote;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        matematik=scanner.nextInt();

        System.out.println("Fizk notunuz: ");
        fizik=scanner.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya=scanner.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce=scanner.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih=scanner.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik=scanner.nextInt();

        finalNote=(matematik+fizik+kimya+turkce+tarih+muzik)/6.0;

        System.out.println("Ortalamanız:"+finalNote);
    }
}