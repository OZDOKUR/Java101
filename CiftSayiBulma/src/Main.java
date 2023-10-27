import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number=scanner.nextInt();

        for (int i =1 ; i<= number; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}