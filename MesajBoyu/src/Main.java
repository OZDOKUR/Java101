import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int smsLimit=160;
        String message;
        int messageNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen mesajınızı girin:");
        message = String.valueOf(scanner.nextLine().length());

        messageNumber = (Integer.valueOf(message)/smsLimit)+1;
        System.out.printf("Mesajınız %s karakterden oluşuyor ve %d SMS'e bölünebilir.",message,messageNumber);

    }
}