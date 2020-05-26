package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class Anagram {

    public String textReverseOnlyLetters(final String text) {

        if (text == null) {
            throw new IllegalArgumentException("Null parameters are not allowed");
        }

        final String textPlusSignAtTheEnd = text + "$";
        String[] words = textPlusSignAtTheEnd.split(" ");
        StringJoiner textReverse = new StringJoiner(" ");

        for (String word : words) {
            textReverse.add(reverseOnlyLetters(word));
        }
        return textReverse.toString().substring(0, textReverse.length() - 1);
    }

    private StringBuilder reverseOnlyLetters(final String word) {

        StringBuilder wordReverse = new StringBuilder(word).reverse();

        for (int i = word.length() - 1; i >= 0; i--) {
            if (!Character.isLetter(wordReverse.charAt(i))) {
                wordReverse.deleteCharAt(i);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                wordReverse.insert(i, word.charAt(i));
            }
        }
        return wordReverse;
    }
}

