package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class TestUtil {
    public static int charCount(String s, char ch) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }

    public static Set<Character> strToSet(String str) {
        if (str == null) return new HashSet<>();
        Set<Character> set = new HashSet<>(str.length());
        for (int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));
        return set;
    }
}
