package ua.com.foxminded.anagrams;

public class Application {

    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        String[] textForRevers = new String[] { "Go45od mor4ning!", "Hal67lo 22world", "Goo01d eve//ning" };

        for (String input : textForRevers) {
            try {
                System.out.println("Your result is: " + anagram.textReverseOnlyLetters(input));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid  input:\"" + e.getMessage() + "\"");
            }
        }
    }
}
