package com.example.demo;

import com.example.demo.service.SymbolFrequencyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.example.demo.TestUtil.charCount;
import static com.example.demo.TestUtil.strToSet;

class SymbolFrequencyServiceTests {

    private final SymbolFrequencyService service = new SymbolFrequencyService();

    @Test
    void serviceTest1() {
        String s = "assassv";
        Map<Character, Integer> res = service.calcSymbol(s);
        countCheck(s, res);
        sortedCheck(res.values().stream().toList());
    }

    // empty string
    @Test
    void serviceTest2() {
        String s = "";
        Map<Character, Integer> res = service.calcSymbol(s);
        countCheck(s, res);
        sortedCheck(res.values().stream().toList());
    }

    @Test
    void serviceTest3() {
        String s = " ";
        Map<Character, Integer> res = service.calcSymbol(s);
        countCheck(s, res);
        sortedCheck(res.values().stream().toList());
    }

    // long string
    @Test
    void serviceTest4() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("asdasd");
            sb.append("gbfgnhg");
        }
        String s = sb.toString();
        Map<Character, Integer> res = service.calcSymbol(s);
        countCheck(s, res);
        sortedCheck(res.values().stream().toList());
    }

    private void countCheck(String s, Map<Character, Integer> res) {
        Set<Character> chars = strToSet(s);
        for (char ch : chars) {
            Assertions.assertEquals(charCount(s, ch), res.get(ch));
        }
    }


    private void sortedCheck(List<Integer> values) {
        for (int i = 1; i < values.size(); i++) {
            Assertions.assertTrue(values.get(i - 1) >= values.get(i));
        }
    }

}
