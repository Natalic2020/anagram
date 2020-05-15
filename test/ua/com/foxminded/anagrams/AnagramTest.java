package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void testTextReverseOnlyLetters_shouldReturnNull_whenInputNull() {

        final String inputResult = null;
        final String textReverseNull = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseNull);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnEmptyString_whenInputEmptyString() {

        final String inputResult = "";
        final String textReverseEmptyString = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseEmptyString);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnWhiteSpace_whenInputWhiteSpace() {

        final String inputResult = " ";
        final String textReverseWhiteSpace = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseWhiteSpace);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetter_whenInputOneLetter() {

        final String inputResult = "g";
        final String textReverseOneLetter = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneLetter);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnWhiteSpaceOneLetter_whenInputWhiteSpaceOneLetter() {

        final String inputResult = " g";
        final String textReverseWhiteSpaceOneLetter = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseWhiteSpaceOneLetter);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterWhiteSpace_whenInputOneLetterWhiteSpace() {

        final String inputResult = "g ";
        final String textReverseOneLetterWhiteSpace = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneLetterWhiteSpace);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetter2WhiteSpace_whenInputOneLetter2WhiteSpace() {

        final String inputResult = "g  ";
        final String textReverseOneLetter2WhiteSpace = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneLetter2WhiteSpace);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumber_whenInputOneNumber() {

        final String inputResult = "5";
        final String textReverseOneNumber = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneNumber);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacter_whenInputSpecialCharacter() {

        final String inputResult = "*";
        final String textReverseSpecialCharacter = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseSpecialCharacter);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnQuote_whenInputQuote() {

        final String inputResult = "'";
        final String textReverseQuote = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseQuote);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnDoubleQuote_whenInputDoubleQuote() {

        final String inputResult = "\"";
        final String textReverseDoubleQuote = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseDoubleQuote);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSlash_whenInputSlash() {

        final String inputResult = "/";
        final String textReverseSlash = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseSlash);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnBackSlash_whenInputBackSlash() {

        final String inputResult = "\\";
        final String textReverseBackSlash = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseBackSlash);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnDoubleQuoteBackSlash_whenInputDoubleQuoteBackSlash() {

        final String inputResult = "\"\\";
        final String textReverseDoubleQuoteBackSlash = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseDoubleQuoteBackSlash);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimes_whenInputOneLetterFewTimes() {

        final String inputResult = "ggggg";
        final String textReverseOneLetterFewTimes = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneLetterFewTimes);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneNumberFewTimes_whenInputOneNumberFewTime() {

        final String inputResult = "55555";
        final String textReverseOneNumberFewTimes = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOneNumberFewTimes);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOneLetterFewTimesUpperLowercased_whenInputOneLetterFewTimesUpperLowercased() {

        final String inputResult = "GGGggggg";
        final String textReverseOneLetterFewTimesUpperLowercased = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "gggggGGG";

        assertEquals(expectedResult, textReverseOneLetterFewTimesUpperLowercased);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnOnlySpecialCharacters_whenInputOnlySpecialCharacters() {

        final String inputResult = "!@*/&%$§";
        final String textReverseOnlySpecialCharacters = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseOnlySpecialCharacters);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndLettersOneWord_whenInputSpecialCharacterUndLettersOneWord() {

        final String inputResult = "H§al%lo";
        final String textReverseSpecialCharacterUndLettersOneWord = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "o§ll%aH";

        assertEquals(expectedResult, textReverseSpecialCharacterUndLettersOneWord);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnSpecialCharacterUndNumbersOneWord_whenInputSpecialCharacterUndNumbersOneWord() {

        final String inputResult = "1!2§3$5%";
        final String textReverseSpecialCharacterUndNumbersOneWord = anagram.textReverseOnlyLetters(inputResult);

        assertEquals(inputResult, textReverseSpecialCharacterUndNumbersOneWord);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsOnlyLetter_whenInputFewWordsOnlyLetter() {

        final String inputResult = "It is a nice day today";
        final String textReverseFewWordsOnlyLetter = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "tI si a ecin yad yadot";

        assertEquals(expectedResult, textReverseFewWordsOnlyLetter);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLetterUndNumbers_whenInputFewWordsLetterUndNumbers() {

        final String inputResult = "It is 5da6y today";
        final String textReverseFewWordsLetterUndNumbers = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "tI si 5ya6d yadot";

        assertEquals(expectedResult, textReverseFewWordsLetterUndNumbers);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsLettersNumbersCharacters_whenInputLettersNumbersCharacters() {

        final String inputResult = "It is6 a nic%e day to6d7ay!";
        final String textReverseFewWordsLettersNumbersCharacters = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expectedResult, textReverseFewWordsLettersNumbersCharacters);
    }
    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpaces_whenInputFewWordsFewWhiteSpaces() {

        final String inputResult = "Hallo  2my   3Friend  2!";
        final String textReverseFewWordsFewWhiteSpaces = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "ollaH  2ym   3dneirF  2!";

        assertEquals(expectedResult, textReverseFewWordsFewWhiteSpaces);
    }

    @Test
    void testTextReverseOnlyLetters_shouldReturnFewWordsFewWhiteSpacesInTheEnd_whenInputFewWordsFewWhiteSpacesInTheEnd() {

        final String inputResult = "Hallo  2my   3Friend  2!   ";
        final String textReverseFewWordsFewWhiteSpacesInTheEnd = anagram.textReverseOnlyLetters(inputResult);
        final String expectedResult = "ollaH  2ym   3dneirF  2!   ";

        assertEquals(expectedResult, textReverseFewWordsFewWhiteSpacesInTheEnd);
    }

}

