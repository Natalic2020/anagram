package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testTextReverseOnlyLetters_shouldReturnNull_whenInputNull() {

        final String input = null;
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnEmptyString_whenInputEmptyString() {

        final String input = "";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnWhiteSpace_whenInputWhiteSpace() {

        final String input = " ";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetter_whenInputOneLetter() {

        final String input = "g";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnWhiteSpaceOneLetter_whenInputWhiteSpaceOneLetter() {

        final String input = " g";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterWhiteSpace_whenInputOneLetterWhiteSpace() {

        final String input = "g ";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetter2WhiteSpace_whenInputOneLetter2WhiteSpace() {

        final String input = "g  ";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumber_whenInputOneNumber() {

        final String input = "5";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacter_whenInputSpecialCharacter() {

        final String input = "*";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnQuote_whenInputQuote() {

        final String input = "'";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnDoubleQuote_whenInputDoubleQuote() {

        final String input = "\"";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSlash_whenInputSlash() {

        final String input = "/";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }


    @Test
    void testTextReverseOnlyLetters_shouldReturnBackSlash_whenInputBackSlash() {

        final String input = "\\";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnDoubleQuoteBackSlash_whenInputDoubleQuoteBackSlash() {

        final String input = "\"\\";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimes_whenInputOneLetterFewTimes() {

        final String input = "ggggg";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumberFewTimes_whenInputOneNumberFewTime() {

        final String input = "55555";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimesUpperLowercased_whenInputOneLetterFewTimesUpperLowercased() {

        final String input = "GGGggggg";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "gggggGGG";

        assertEquals(expected, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOnlySpecialCharacters_whenInputOnlySpecialCharacters() {

        final String input = "!@*/&%$§";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndLettersOneWord_whenInputSpecialCharacterUndLettersOneWord() {

        final String input = "H§al%lo";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "o§ll%aH";

        assertEquals(expected, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndNumbersOneWord_whenInputSpecialCharacterUndNumbersOneWord() {

        final String input = "1!2§3$5%";
        final String actual = anagram.textReverseOnlyLetters(input);

        assertEquals(input, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsOnlyLetter_whenInputFewWordsOnlyLetter() {

        final String input = "It is a nice day today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si a ecin yad yadot";

        assertEquals(expected, actual);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLetterUndNumbers_whenInputFewWordsLetterUndNumbers() {

        final String input = "It is 5da6y today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si 5ya6d yadot";

        assertEquals(expected, actual);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLettersNumbersCharacters_whenInputLettersNumbersCharacters() {

        final String input = "It is6 a nic%e day to6d7ay!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expected, actual);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpaces_whenInputFewWordsFewWhiteSpaces() {

        final String input = "Hallo  2my   3Friend  2!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "ollaH  2ym   3dneirF  2!";

        assertEquals(expected, actual);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpacesInTheEnd_whenInputFewWordsFewWhiteSpacesInTheEnd() {

        final String input = "Hallo  2my   3Friend  2!   ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "ollaH  2ym   3dneirF  2!   ";

        assertEquals(expected, actual);
    }

}

