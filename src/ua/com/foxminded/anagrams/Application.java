package ua.com.foxminded.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Application {

	public static void main(String[] args) throws IOException {
	    
	    String textRevers1 =  Anagram.TextRevers("Go45od mor4ning!");
	    String textRevers2 =  Anagram.TextRevers("Hal67lo 22world");  
	    
	    System.out.println(textRevers1);
	    System.out.println(textRevers2);
	    System.out.println(Anagram.TextRevers("Goo01d eve//ning"));  
	}	
}