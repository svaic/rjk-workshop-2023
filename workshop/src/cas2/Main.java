package cas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int numberOfTries = in.nextInt();

        Hangman hangman = new Hangman(numberOfTries, word);

        while (!hangman.isGameFinished()) {
            Character characterToBeGuessed = in.next().charAt(0);

            hangman.guess(characterToBeGuessed);
        }
    }
}
