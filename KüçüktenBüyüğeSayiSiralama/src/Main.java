import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Sayıları girin:");

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sıralanmış dizi:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
