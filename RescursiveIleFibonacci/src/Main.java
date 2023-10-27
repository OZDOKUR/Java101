import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaçıncı elemanı hesaplamak istiyorsunuz: ");
        int n = scanner.nextInt();

        int fibonacciSonuc = fibonacci(n);
        System.out.println(n + ". eleman: " + fibonacciSonuc);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
