package ua.com.foxminded.anagrams;

public class Application {

    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        String textRevers1 = anagram.textReverse("Go45od mor4ning!");
        String textRevers2 = anagram.textReverse("Hal67lo 22world");
        String textRevers3 = anagram.textReverse("Goo01d eve//ning");

        System.out.println(textRevers1);
        System.out.println(textRevers2);
        System.out.println(textRevers3);
    }
}
