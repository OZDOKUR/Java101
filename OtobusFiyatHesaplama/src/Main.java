import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ticketPrice;
        double ticketDiscountPrice;
        double tripDiscount;
        double ageDiscountPrice;
        double ageDiscountRate;
        int distance;
        int age;
        int km;
        int tripType;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        km = scanner.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tripType = scanner.nextInt();

        if(km>0 && age >0 && (tripType == 1 || tripType ==2)){
            ticketPrice = km * 0.10;
            ageDiscountPrice=0;
            ageDiscountRate=0;
            tripDiscount=0;

            if(age < 12){ageDiscountRate=0.5;}
            else if (age<24) {ageDiscountRate = 0.10;}
            else if (age>=65) {ageDiscountRate = 0.30;}

            ageDiscountPrice=ticketPrice*ageDiscountRate;
            ticketDiscountPrice= ticketPrice-ageDiscountPrice;

            if (tripType==2){
                ticketDiscountPrice-= ticketDiscountPrice*0.2;
                ticketDiscountPrice*=2;
            }

            System.out.println("Toplam Tutar = "+ticketDiscountPrice);
        }
        else{
            System.out.println("Hatalı Veri Girdiniz!!");
        }

    }
}