import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int number1 = scanner.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();

        int ebob = findEBOB(number1, number2);
        int ekok = findEKOK(number1, number2);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }

    public static int findEBOB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findEKOK(int a, int b) {
        int ebob = findEBOB(a, b);
        int ekok = (a * b) / ebob;
        return ekok;
    }
}
