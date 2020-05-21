package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

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
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputEmptyString() {

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
    void textReverseOnlyLetters_shouldKeepNumberWhitesSpaces_whenInputWhitesSpaces() {

        final String input = "     ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputOneLetter() {

        final String input = "g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldKeepHeadWhitespace__whenInputStarstWithWhitespace() {

        final String input = " g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldKeepTailWhitespace__whenInputEndstWithWhitespace() {

        final String input = "g ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldKeepNumberHeadWhitespaces__whenInputStarstWithFewWhitespaces() {

        final String input = "         g";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldKeepNumberTailWhitespaces__whenInputEndstWithFewWhitespaces() {

        final String input = "g     ";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputOneNumber() {

        final String input = "5";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputSpecialCharacter() {

        final String input = "*";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputOneLetterFewTimesLowecased() {

        final String input = "ggggg";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputOneNumberFewTime() {

        final String input = "55555";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseAllLetters_whenInputOneLetterFewTimesUpperLowercased() {

        final String input = "GGGggggg";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "gggggGGG";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputOnlySpecialCharacters() {

        final String input = "!@*/&%$§";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseOnlyLetters_whenInputSpecialCharacterUndLettersOneWord() {

        final String input = "H§al%lo";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "o§ll%aH";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReturnTheSame_whenInputSpecialCharacterUndNumbersOneWord() {

        final String input = "1!2§3$5%";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseAllLetters_whenInputFewWordsOnlyLetter() {

        final String input = "It is a nice day today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si a ecin yad yadot";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseOnlyLetters_whenInputFewWordsLetterUndNumbers() {

        final String input = "It is 5da6y today";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si 5ya6d yadot";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseOnlyLetters_whenInputLettersNumbersCharacters() {

        final String input = "It is6 a nic%e day to6d7ay!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expected, actual);
    }

    @Test
    void textReverseOnlyLetters_shouldReverseOnlyLetters_whenInputFewWordsFewWhiteSpaces() {

        final String input = "Hallo  2my   3Friend  2!";
        final String actual = anagram.textReverseOnlyLetters(input);
        final String expected = "ollaH  2ym   3dneirF  2!";

        assertEquals(expected, actual);
    }


}

