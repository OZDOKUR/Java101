import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n= 5;
        Scanner scanner = new Scanner(System.in);
        int number;
        int sortedArray;
        int numbersArray[]= new int[n];


        for (int i = 1; i <=5 ; i++) {

            System.out.println(i+". Sayıyı giriniz : ");
            number=scanner.nextInt();
            numbersArray[i-1]=number;
        }
        Arrays.sort(numbersArray);
        System.out.println("Girilen sayılar arasında en küçük sayı : "+numbersArray[0]);
        
        System.out.println("Girilen sayılar arasında en büyük sayı : "+numbersArray[n-1]);
    }
}