import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        double c;

        System.out.println("1. Kenarı Giriniz: ");
        a=scanner.nextInt();

        System.out.println("2. Kenarı Giriniz: ");
        b=scanner.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.printf("Hipotenüs  = %.2f",c);
    }
}