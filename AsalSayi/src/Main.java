import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int test;
        boolean isPrime=true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        number=scanner.nextInt();

        for (int i = 2; i < number; i++) {
            test = 17%i;
            if (test == 0){
                isPrime=false;
                break;
            }

        }
        if (isPrime == true){
            System.out.println(number + " sayısı ASALDIR.");
        }
        else {
            System.out.println(number + " sayısı ASAL DEĞİLDİR.");
        }
    }
}