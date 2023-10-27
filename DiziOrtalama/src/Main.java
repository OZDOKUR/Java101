import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin:");
        n = scanner.nextInt();
        int[] numbers= new int[n];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }
        sum = sum/ numbers.length;

        System.out.println("Dizideki elemanların ortalaması: " +sum);
    }
}