package ua.com.foxminded.anagrams;

import java.io.IOException;
import java.util.StringJoiner;

public class Anagram {
    
    public static String TextRevers(final String text) throws IOException {

        String[] words = text.split(" ");
        
        StringJoiner sj = new StringJoiner(" ");
        
        for (String word : words) {
            
            sj.add(wordReverse(word));
        }
        return sj.toString();
    }
       
    
     private static StringBuilder wordReverse(final String word) {
        
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
