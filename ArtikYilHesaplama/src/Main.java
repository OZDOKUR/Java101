import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = scanner.nextInt();
        if (year%100 == 0 && year%400 == 0){
            System.out.printf("%d bir artık yıldır !",year);
        }
        else {
            if(year%4==0){
                System.out.printf("%d bir artık yıldır !",year);
            }
            else {
                System.out.printf("%d bir artık yıl değildir !",year);
            }
        }

    }
}