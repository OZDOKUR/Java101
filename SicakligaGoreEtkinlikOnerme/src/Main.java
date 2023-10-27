import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double temperature;
        String event = null;
        Scanner scanner = new Scanner(System.in);
        temperature = scanner.nextDouble();

        System.out.println("Derece : ");
        if (temperature < 5) {
            event="Kayak";
        }
        else if (temperature>=5 && temperature< 15) {
            event="Tiyatro";
        }
        else if (temperature>=15 && temperature< 25) {
            event="Mangal";
        }
        else if (temperature>=25) {
            event="Yüzme";
        }
        System.out.printf("Önerilen Etkinlik %s",event);
    }
}