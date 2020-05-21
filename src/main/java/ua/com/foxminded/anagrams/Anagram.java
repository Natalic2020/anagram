package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class Anagram {

    private static final String REGEX_SPLIT_KEEP_WHITESPACE = "((?<=\\s)|(?=\\s))";
    private static final String EMPTY_STRING = "";

    public String textReverseOnlyLetters(final String text) {

        if (text == null) {
            throw new IllegalArgumentException("Null parameters are not allowed");
        }

        String[] words = text.split(REGEX_SPLIT_KEEP_WHITESPACE);

        StringJoiner textReverse = new StringJoiner(EMPTY_STRING);

        for (String word : words) {

            textReverse.add(reverseOnlyLetters(word));
        }

        return textReverse.toString();
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

