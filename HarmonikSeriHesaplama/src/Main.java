import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result= 0.0;
        double harmonic;
        Scanner scanner = new Scanner(System.in);

        System.out.println("N Sayını Giriniz : ");
        n = scanner.nextInt();

        for (double i=1 ; i <=n; i++){
            harmonic =1/i;
            result=result+harmonic;
        }
        System.out.println("Sonuç : "+result);
    }
}