import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month;
        int day;
        String sign= " ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayı giriniz : ");
        month = scanner.nextInt();
        System.out.print("Günü giriniz : ");
        day= scanner.nextInt();

        switch (month) {
            case 1:
                if (day>=1 && day<=31){
                    if (day <= 21){sign="Oğlak";}
                    else {sign= "Kova";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 2:
                if (day>=1 && day<=29){
                    if (day <= 19){sign="Kova";}
                    else {sign= "Balık";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 3:
                if (day>=1 && day<=31){
                    if (day <= 20){sign="Balık";}
                    else {sign= "Koç";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 4:
                if (day>=1 && day<=30){
                    if (day <= 20){sign="Koç";}
                    else {sign= "Boğa";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 5:
                if (day>=1 && day<=31){
                    if (day <= 21){sign="Boğa";}
                    else {sign= "İkizler";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 6:
                if (day>=1 && day<=30){
                    if (day <= 22){sign="İkizler";}
                    else {sign= "Yengeç";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 7:
                if (day>=1 && day<=31){
                    if (day <= 22){sign="Yengeç";}
                    else {sign= "Aslan";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 8:
                if (day>=1 && day<=31){
                    if (day <= 22){sign="Aslan";}
                    else {sign= "Başak";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 9:
                if (day>=1 && day<=30){
                    if (day <= 22){sign="Başak";}
                    else {sign= "Terazi";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 10:
                if (day>=1 && day<=31){
                    if (day <= 22){sign="Terazi";}
                    else {sign= "Akrep";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 11:
                if (day>=1 && day<=30){
                    if (day <= 21){sign="Akrep";}
                    else {sign= "Yay";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            case 12:
                if (day>=1 && day<=31){
                    if (day <= 21){sign="Yay";}
                    else {sign= "Oğlak";}
                }
                else{System.out.println("Günü Hatalı Girdin!!");}
                break;
            default:
                System.out.println("Geçersiz ay");
        }
        System.out.println("Burcunuz : "+sign);

    }
}