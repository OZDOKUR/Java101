import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"java", "programming", "computer", "game"};

        String selectedWord = words[(int) (Math.random() * words.length)];
        int remainingGuesses = 6;
        boolean[] guessedLetters = new boolean[selectedWord.length()];

        while (true) {
            System.out.print("Kelime: ");
            for (int i = 0; i < selectedWord.length(); i++) {
                if (guessedLetters[i]) {
                    System.out.print(selectedWord.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("\nKalan Tahmin Hakkı: " + remainingGuesses);

            System.out.print("Bir harf girin: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Lütfen sadece bir harf girin!");
                continue;
            }

            char guess = input.charAt(0);
            boolean isCorrectGuess = false;


            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guess) {
                    if (guessedLetters[i]) {
                        System.out.println("Bu harfi zaten tahmin ettiniz!");
                        break;
                    }
                    guessedLetters[i] = true;
                    isCorrectGuess = true;
                }
            }

            if (!isCorrectGuess) {
                remainingGuesses--;
                System.out.println("Yanlış tahmin!");
            }

            boolean isWordGuessed = true;
            for (boolean guessed : guessedLetters) {
                if (!guessed) {
                    isWordGuessed = false;
                    break;
                }
            }

            if (isWordGuessed) {
                System.out.println("Tebrikler! Kelimeyi doğru tahmin ettiniz: " + selectedWord);
                break;
            }

            if (remainingGuesses == 0) {
                System.out.println("Maalesef, tahmin hakkınız kalmadı. Doğru kelime: " + selectedWord);
                break;
            }
        }
    }
}
