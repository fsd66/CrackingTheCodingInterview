package net.fsd66.crackingthecodinginterview.chapter1.tests;

import net.fsd66.crackingthecodinginterview.chapter1.Chapter1Questions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Question3Tests {
    @Test
    public void returnsSameString() {
        String test = "nospaces";
        assertEquals(test, Chapter1Questions.question3Urlify(test));
    }

    @Test
    public void checkGivenExampleFromBook() {
        String solution = "Mr%20John%20Smith";
        String theInput = "Mr John Smith    ";

        assertEquals(solution, Chapter1Questions.question3Urlify(theInput));
    }

    @Test
    public void handleEmpty() {
        String solution = "";
        String theInput = "";

        assertEquals(solution, Chapter1Questions.question3Urlify(theInput));
    }

    @Test
    public void handleInvalidInput() {
        String invalidString = "This string is not valid since it does not have the proper length";
        Executable executable = () -> Chapter1Questions.question3Urlify(invalidString);

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void throwNull() {
        Executable executable = () -> Chapter1Questions.question3Urlify(null);
        assertThrows(NullPointerException.class, executable);
    }
}
