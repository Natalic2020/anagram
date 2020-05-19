package test.java.ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import main.java.ua.com.foxminded.anagrams.Anagram;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void textReverseOnlyLetters_shouldThrowIllegalArgumentException_whenInputNull() {

        final String input = null;

        assertThrows(IllegalArgumentException.class, () -> {
            anagram.textReverseOnlyLetters(input);
        });
    }

    @Test
    void textReverseOnlyLetters_shouldMessageIllegalArgumentException_whenInputNull() {

        final String input = null;
        final String expected = "Null parameters are not allowed";

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            anagram.textReverseOnlyLetters(input);
        });

        assertEquals(expected, exception.getMessage());
    }


    @Test
    void textReverseOnlyLetters_shouldReturnEmptyString_whenInputEmptyString() {

        final String input = "";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnWhiteSpace_whenInputWhiteSpace() {

        final String input = " ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnFewWhiteSpace_whenInputWhiteSpaces() {

        final String input = "     ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneLetter_whenInputOneLetter() {

        final String input = "g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnWhiteSpaceOneLetter_whenInputWhiteSpaceOneLetter() {

        final String input = " g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneLetterWhiteSpace_whenInputOneLetterWhiteSpace() {

        final String input = "g ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneLetterFewWhiteSpacesAtTheBeginning_whenInputOneLetterFewWhiteSpacesAtTheBeginning() {

        final String input = "         g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }


    @Test
    void textReverseOnlyLetters_shouldReturnOneLetterFewWhiteSpacesAtTheEnd_whenInputOneLetterFewWhiteSpacesAtTheEnd() {

        final String input = "g     ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }


    @Test
    void textReverseOnlyLetters_shouldReturnOneNumber_whenInputOneNumber() {

        final String input = "5";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnSpecialCharacter_whenInputSpecialCharacter() {

        final String input = "*";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnQuote_whenInputQuote() {

        final String input = "'";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnDoubleQuote_whenInputDoubleQuote() {

        final String input = "\"";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnSlash_whenInputSlash() {

        final String input = "/";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnBackSlash_whenInputBackSlash() {

        final String input = "\\";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnDoubleQuoteBackSlash_whenInputDoubleQuoteBackSlash() {

        final String input = "\"\\";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneLetterFewTimes_whenInputOneLetterFewTimes() {

        final String input = "ggggg";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneNumberFewTimes_whenInputOneNumberFewTime() {

        final String input = "55555";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOneLetterFewTimesUpperLowercased_whenInputOneLetterFewTimesUpperLowercased() {

        final String input = "GGGggggg";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "gggggGGG";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnOnlySpecialCharacters_whenInputOnlySpecialCharacters() {

        final String input = "!@*/&%$§";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnSpecialCharacterUndLettersOneWord_whenInputSpecialCharacterUndLettersOneWord() {

        final String input = "H§al%lo";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "o§ll%aH";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnSpecialCharacterUndNumbersOneWord_whenInputSpecialCharacterUndNumbersOneWord() {

        final String input = "1!2§3$5%";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnFewWordsOnlyLetter_whenInputFewWordsOnlyLetter() {

        final String input = "It is a nice day today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si a ecin yad yadot";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnFewWordsLetterUndNumbers_whenInputFewWordsLetterUndNumbers() {

        final String input = "It is 5da6y today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si 5ya6d yadot";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnFewWordsLettersNumbersCharacters_whenInputLettersNumbersCharacters() {

        final String input = "It is6 a nic%e day to6d7ay!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpaces_whenInputFewWordsFewWhiteSpaces() {

        final String input = "Hallo  2my   3Friend  2!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "ollaH  2ym   3dneirF  2!";

        assertEquals(expected, actual);
    }


}

