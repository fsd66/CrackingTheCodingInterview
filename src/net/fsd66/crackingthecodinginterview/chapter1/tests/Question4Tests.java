package net.fsd66.crackingthecodinginterview.chapter1.tests;

import net.fsd66.crackingthecodinginterview.chapter1.Chapter1Questions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Question4Tests {
    @Test
    public void returnsTrue() {
        assertTrue(Chapter1Questions.question4PalindromePermutation("racecar"));
    }

    @Test
    public void returnsFalse() {
        assertFalse(Chapter1Questions.question4PalindromePermutation("not a racecar"));
    }

    @Test
    public void exampleFromBook() {
        assertTrue(Chapter1Questions.question4PalindromePermutation("Tact Coa"));
    }

    @Test
    public void numbersCanBePalindromesToo() {
        assertTrue(Chapter1Questions.question4PalindromePermutation("123454321"));
    }

    @Test
    public void handleEmpty() {
        assertTrue(Chapter1Questions.question4PalindromePermutation(""));
    }

    @Test
    public void throwNull() {
        Executable executable = () -> Chapter1Questions.question4PalindromePermutation(null);
        assertThrows(NullPointerException.class, executable);
    }
}
