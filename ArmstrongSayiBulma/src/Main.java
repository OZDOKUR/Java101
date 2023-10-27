import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int digitCount = String.valueOf(number).length();
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }
}
