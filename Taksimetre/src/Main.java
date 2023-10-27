import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kmUcret=2.20;
        int km,azamiTutar=20,acilisUcreti=10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç km gittiniz:");
        km= scanner.nextInt();
        tutar=acilisUcreti+(km*kmUcret);

        tutar = (tutar<20) ? 20 : tutar;
        System.out.printf("Taksi Ücreti %.2f dir.",tutar);
    }
}