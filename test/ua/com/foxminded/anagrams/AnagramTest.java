package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testTextReverseOnlyLettersGetNullSendNull() {

        final String inputResult = null;
        final String expectedResult = null;

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLettersOutputTextInputText() {

        final String inputResult = "Go45od mor4ning!";
        final String expectedResult = "do45oG gni4nrom!";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

}

