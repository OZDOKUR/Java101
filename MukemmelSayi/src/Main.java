import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        number=scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum){
            System.out.println(number + " mükemmel bir sayıdır.");
        }
        else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }
}
