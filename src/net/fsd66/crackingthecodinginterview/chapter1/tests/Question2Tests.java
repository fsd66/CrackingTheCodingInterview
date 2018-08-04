package net.fsd66.crackingthecodinginterview.chapter1.tests;

import net.fsd66.crackingthecodinginterview.chapter1.Chapter1Questions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Question2Tests {
    @Test
    public void returnsTrue() {
        assertTrue(Chapter1Questions.question2CheckPermutation("abcde", "edcba"));
    }

    @Test
    public void returnsFalse() {
        assertFalse(Chapter1Questions.question2CheckPermutation("abcdef", "qwerty"));
    }

    @Test
    public void differentLengths() {
        assertFalse(Chapter1Questions.question2CheckPermutation("qwertyuiop", "asdfg"));
    }

    @Test
    public void handleEmpty() {
        assertTrue(Chapter1Questions.question2CheckPermutation("", ""));
    }

    @Test
    public void caseSensitive() {
        String test = "sdfghj";
        assertFalse(Chapter1Questions.question2CheckPermutation(test, test.toUpperCase()));
    }

    @Test
    public void longString() {
        String test = "Hello this is a test of a longer string.";
        assertTrue(Chapter1Questions.question2CheckPermutation(test, test));
    }

    @Test
    public void longStringFail() {
        String test = "Hi, this is also a long string.  Hopefully it doesn't take too long!";
        String test2 = "Hi, this is a very different string.";

        assertFalse(Chapter1Questions.question2CheckPermutation(test, test2));
    }

    @Test
    public void throwNull() {
        Executable executable = () -> Chapter1Questions.question2CheckPermutation(null, null);
        assertThrows(NullPointerException.class, executable);
    }
}
