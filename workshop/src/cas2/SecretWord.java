package cas2;

import java.util.ArrayList;
import java.util.List;

public class SecretWord {
    List<Character> word;
    List<Character> charactersGuessed;

    public SecretWord(List<Character> word) {
        this.word = word;
        charactersGuessed = new ArrayList<>();
    }

    public void printWord() {
        for (int i = 0; i < this.word.size(); i++) {
            System.out.print(this.word.get(i));
        }
        System.out.println();
    }

    public boolean guess(Character c) {

        if (charactersGuessed.contains(c)) {
            System.out.println("bukvata vekje postoi");
            return true;
        } else {
            charactersGuessed.add(c);

            boolean pogodena = false;
            for (int i = 0; i < word.size(); i++) {
                if (word.get(i).equals(c)) {
                    pogodena = true;
                }
            }

            if (pogodena) {
                System.out.println("bukvata e pogodena");
            } else {
                System.out.println("bukvata ne e pogodena");
            }

            return pogodena;
        }
    }

    public String getMaskedWord() {
        String maskedWord =  "";

        for (int i = 0; i < word.size(); i++) {
            if (charactersGuessed.contains(word.get(i))) {
                maskedWord += word.get(i);
            } else {
                maskedWord += "*";
            }
        }

        return maskedWord;
    }

    public void printCharactersGuessed() {
        System.out.println("the characters which you already guessed are:");

        for (int i = 0; i < charactersGuessed.size(); i++) {
            System.out.print(charactersGuessed.get(i) + " ");
        }

        System.out.println();
    }

    public boolean isWordGuesed() {
        for (int i = 0; i < word.size(); i++) {
            if (!charactersGuessed.contains(word.get(i))) {
                return false;
            }
        }

        return true;
    }
}
