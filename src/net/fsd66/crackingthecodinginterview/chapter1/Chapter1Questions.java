package net.fsd66.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Chapter1Questions {
    public static boolean question1IsUnique(String input) {
        Set<Character> memory = new HashSet<>();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(memory.contains(c)) {
                return false;
            }

            memory.add(c);
        }

        return true;
    }

    public static boolean question2CheckPermutation(String input1, String input2) {
        if(input1.length() != input2.length()) {
            return false;
        }

        Map<Character, Integer> memory = new HashMap<>();
        for(int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            int count = memory.containsKey(c) ? memory.get(c) : 0;
            count++;
            memory.put(c, count);
        }

        for(int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);

            if(!memory.containsKey(c)) {
                return false;
            }

            int count = memory.get(c);
            count--;

            if(count < 0) {
                return false;
            }

            memory.put(c, count);
        }

        for(Integer i : memory.values()) {
            if(i != 0) {
                return false;
            }
        }

        return true;
    }

    public static String question3Urlify(String input) {
        char[] outputArray = new char[input.length()];

        int pointer = 0;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == ' ') {
                if(pointer >= outputArray.length) {
                    continue;
                }
                outputArray[pointer] = '%';
                pointer++;
                outputArray[pointer] = '2';
                pointer++;
                outputArray[pointer] = '0';
                pointer++;

            } else {
                if(pointer >= outputArray.length) {
                    throw new IllegalArgumentException("Input string must be a length long enough to accommodate additional characters created!");
                }
                outputArray[pointer] = c;
                pointer++;
            }
        }

        return String.copyValueOf(outputArray);
    }

    public static boolean question4PalindromePermutation(String input) {
        Map<Character, Integer> memory = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c >= 'a' || c <= 'z') {
                // convert lower case to upper for case insensitivity
                c -= 'a' - 'A';
            }

            int count = memory.containsKey(c) ? memory.get(c) : 0;
            count++;
            memory.put(c, count);
        }

        boolean oddNumberFound = false; // Forgive the first odd number found since palindromes can have their center character not repeated.

        for(Integer i : memory.values()) {
            if(i % 2 != 0) {
                if(oddNumberFound) {
                    return false;
                }

                oddNumberFound = true;
            }
        }

        return true;
    }
}
