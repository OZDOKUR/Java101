import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin kenar uzunluğunu girin: ");
        int sideLength = scanner.nextInt();

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
