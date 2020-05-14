package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testTextReverseOnlyLetters_shouldReturnNull_whenInputNull() {

        final String inputResult = null;
        final String expectedResult = null;

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnEmptyString_whenInputEmptyString() {

        final String inputResult = "";
        final String expectedResult = "";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnWhiteSpace_whenInputWhiteSpace() {

        final String inputResult = " ";
        final String expectedResult = " ";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetter_whenInputOneLetter() {

        final String inputResult = "g";
        final String expectedResult = "g";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumber_whenInputOneNumber() {

        final String inputResult = "5";
        final String expectedResult = "5";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacter_whenInputSpecialCharacter() {

        final String inputResult = "*";
        final String expectedResult = "*";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimes_whenInputOneLetterFewTimes() {

        final String inputResult = "ggggg";
        final String expectedResult = "ggggg";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumberFewTimes_whenInputOneNumberFewTime() {

        final String inputResult = "55555";
        final String expectedResult = "55555";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimesUpperLowercased_whenInputOneLetterFewTimesUpperLowercased() {

        final String inputResult = "GGGGGggggg";
        final String expectedResult = "gggggGGGGG";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOnlySpecialCharacters_whenInputOnlySpecialCharacters() {

        final String inputResult = "!@*/&%$§";
        final String expectedResult = "!@*/&%$§";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndLettersOneWord_whenInputSpecialCharacterUndLettersOneWord() {

        final String inputResult = "H§al%lo";
        final String expectedResult = "o§ll%aH";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndNumbersOneWord_whenInputSpecialCharacterUndNumbersOneWord() {

        final String inputResult = "1!2§3$5%";
        final String expectedResult = "1!2§3$5%";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsOnlyLetter_whenInputFewWordsOnlyLetter() {

        final String inputResult = "It is a nice day today";
        final String expectedResult = "tI si a ecin yad yadot";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLetterUndNumbers_whenInputFewWordsLetterUndNumbers() {

        final String inputResult = "It is 5da6y today";
        final String expectedResult = "tI si 5ya6d yadot";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLettersNumbersCharacters_whenInputLettersNumbersCharacters() {

        final String inputResult = "It is6 a nic%e day to6d7ay!";
        final String expectedResult = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpaces_whenInputFewWordsFewWhiteSpaces() {

        final String inputResult = "Hallo  2my   3Friend  2!";
        final String expectedResult = "ollaH  2ym   3dneirF  2!";

        assertEquals(expectedResult, anagram.textReverseOnlyLetters(inputResult));
    }

}

