package cas2;

import java.util.ArrayList;
import java.util.List;

public class Hangman {
    private int numberOfTries;
    private SecretWord word;

    public Hangman(int numberOfTries, String word) {
        this.numberOfTries = numberOfTries;

        List<Character> wordList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.charAt(i));
        }

        this.word = new SecretWord(wordList);
    }

    public void guess(Character c) {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        boolean didWeGuessCorrectly =  word.guess(c);

        if (!didWeGuessCorrectly) {
            numberOfTries--;
        }

        System.out.println("number of tries: " + numberOfTries);

        word.printCharactersGuessed();

        System.out.println(word.getMaskedWord());

    }

    public boolean isGameFinished() {
        if (numberOfTries == 0) {
            System.out.println("you lost, the word was");

           word.printWord();
            return true;
        }

        if (word.isWordGuesed()) {
            System.out.println("you win!!");
            return true;
        }

        return false;
    }
}
