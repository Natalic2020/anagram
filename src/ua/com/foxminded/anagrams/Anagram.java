package ua.com.foxminded.anagrams;

import java.util.StringJoiner;

public class Anagram {
    
    private static final String SPACE_SIGN = " ";
    private static final String BLANK = "";

    public String textReverseOnlyLetters(final String text) {

        if (text == null) {
            return text;
        }

        String[] words = text.split(SPACE_SIGN);
        
        StringJoiner textReverse = new StringJoiner(SPACE_SIGN);
        
        for (String word : words) {
            
            textReverse.add(reverseOnlyLetters(word));
        }

        while (textReverse.length() < text.length()) {
            textReverse.add("");
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
