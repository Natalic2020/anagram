package ua.com.foxminded.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Application {

	public static void main(String[] args) throws IOException {

	    System.out.print("Input text for reverse: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final String inputText = reader.readLine();

		String[] words = inputText.split(" ");
		
		StringBuffer textReverse = new StringBuffer();
		
		StringJoiner sj = new StringJoiner(" ");
		
		for (String word : words) {
			
			textReverse.append(wordReverse(word)).append(" ");
			sj.add(wordReverse(word));
			
		}
		
		System.out.print("Output reversed text:   ");
		System.out.println(textReverse);
		System.out.println(sj.toString());
	}

	private static StringBuffer wordReverse(String word) {
		StringBuffer wordReverse = new StringBuffer(word).reverse();

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