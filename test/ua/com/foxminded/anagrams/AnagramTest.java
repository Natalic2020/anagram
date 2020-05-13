package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testTextReverseOnlyLettersNull() {

        assertEquals(null, anagram.textReverseOnlyLetters(null));
    }

    @Test
    void testTextReverseOnlyLetters() {

        assertEquals("do45oG gni4nrom!", anagram.textReverseOnlyLetters("Go45od mor4ning!"));
    }

}

