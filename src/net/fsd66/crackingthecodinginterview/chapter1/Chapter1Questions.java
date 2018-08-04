package net.fsd66.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Chapter1Questions {
    public static boolean question1IsUnique(String s) {
        char[] characterArray = s.toCharArray();
        Set<Character> memory = new HashSet<>();

        for(char c : characterArray) {
            if(memory.contains(c)) {
                return false;
            }

            memory.add(c);
        }

        return true;
    }

    public static boolean question2CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] characterArray1 = s1.toCharArray();
        char[] characterArray2 = s2.toCharArray();

        Map<Character, Integer> memory = new HashMap<>();
        for(char c : characterArray1) {
            int count = memory.containsKey(c) ? memory.get(c) : 0;
            count++;
            memory.put(c, count);
        }

        for(char c : characterArray2) {
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
}
