import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tutar,kdvTutar,kdvOran=0.18;
        System.out.println("KDV'sini hesaplamak istediğiniz tutarı giriniz:");
        tutar=scanner.nextDouble();
        kdvTutar=tutar+(tutar*kdvOran);
        System.out.printf("Kdv'li fiyatı %.2f dır ",kdvTutar);
    }
}