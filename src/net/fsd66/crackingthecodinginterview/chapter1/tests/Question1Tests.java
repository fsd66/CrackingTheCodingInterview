package net.fsd66.crackingthecodinginterview.chapter1.tests;

import net.fsd66.crackingthecodinginterview.chapter1.Chapter1Questions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Question1Tests {
    @Test
    public void returnsFalse() {
        assertFalse(Chapter1Questions.question1IsUnique("hello"));
    }

    @Test
    public void returnsTrue() {
        assertTrue(Chapter1Questions.question1IsUnique("world"));
    }

    @Test
    public void handlesEmpty() {
        assertTrue(Chapter1Questions.question1IsUnique(""));
    }

    @Test
    public void capsAreUnique() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String testString = alphabet + alphabet.toUpperCase();
        assertTrue(Chapter1Questions.question1IsUnique(testString));
    }

    @Test
    public void twoSpacesArentUnique() {
        assertFalse(Chapter1Questions.question1IsUnique("  "));
    }

    @Test
    public void throwNull() {
        Executable executable = () -> Chapter1Questions.question1IsUnique(null);
        assertThrows(NullPointerException.class, executable);
    }
}
