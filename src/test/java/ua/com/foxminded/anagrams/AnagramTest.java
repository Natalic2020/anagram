package ua.com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ua.com.foxminded.anagrams.Anagram;


class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void reverseOnlyLetters_shouldThrowIllegalArgumentException_whenInputNull() {

        final String input = null;

        assertThrows(IllegalArgumentException.class, () -> {
            anagram.reverseOnlyLetters(input);
        });
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputEmptyString() {

        final String input = "";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnWhitespace_whenInputWhitespace() {

        final String input = " ";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldKeepNumberWhitespaces_whenInputWhitespaces() {

        final String input = "     ";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputOneLetter() {

        final String input = "g";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldKeepHeadWhitespace_whenInputStartWithWhitespace() {

        final String input = " g";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldKeepNumberHeadWhitespaces_whenInputStartWithFewWhitespaces() {

        final String input = "         g";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldKeepNumberTailWhitespaces_whenInputEndWithFewWhitespaces() {

        final String input = "g     ";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputOneNumber() {

        final String input = "5";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputSpecialCharacter() {

        final String input = "*";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputOneLetterFewTimesLowercased() {

        final String input = "ggggg";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputOneNumberFewTimes() {

        final String input = "55555";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseAllLetters_whenInputOneLetterFewTimesUpperLowercased() {

        final String input = "GGGggggg";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "gggggGGG";

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputOnlySpecialCharacters() {

        final String input = "!@*/&%$§";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseOnlyLetters_whenInputSpecialCharacterUndLettersOneWord() {

        final String input = "H§al%lo";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "o§ll%aH";

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReturnTheSame_whenInputSpecialCharacterUndNumbersOneWord() {

        final String input = "1!2§3$5%";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = input;

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseAllLettersEachWord_whenInputFewWordsOnlyLetters() {

        final String input = "It is a nice day today";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "tI si a ecin yad yadot";

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseOnlyLettersEachWord_whenInputFewWordsLettersUndNumbers() {

        final String input = "It is 5da6y today";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "tI si 5ya6d yadot";

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseOnlyLettersEachWord_whenInputLettersNumbersCharacters() {

        final String input = "It is6 a nic%e day to6d7ay!";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "tI si6 a eci%n yad ya6d7ot!";

        assertEquals(expected, actual);
    }

    @Test
    void reverseOnlyLetters_shouldReverseOnlyLettersEachWord_whenInputFewWordsFewWhitespaces() {

        final String input = "Hallo  2my   3Friend  2!";
        final String actual = anagram.reverseOnlyLetters(input);
        final String expected = "ollaH  2ym   3dneirF  2!";

        assertEquals(expected, actual);
    }


}


