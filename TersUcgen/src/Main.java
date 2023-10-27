import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç satır olsun: ");
        int rowCount = scanner.nextInt();

        for (int i = rowCount; i >= 1; i--) {
            for (int j = 1; j <= rowCount - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
