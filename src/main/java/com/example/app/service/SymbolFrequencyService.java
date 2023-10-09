package com.example.app.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SymbolFrequencyService {

    public Map<Character, Integer> calcSymbol(String s) {
        Map<Character, Integer> bank = new HashMap<>();
        for (char ch : s.toCharArray()) {
            bank.put(ch, bank.getOrDefault(ch, 0) + 1);
        }
        return toSortedMap(bank);
    }

    private Map<Character, Integer> toSortedMap(Map<Character, Integer> bank) {
        return bank.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> {
                            throw new IllegalArgumentException();
                        },
                        LinkedHashMap<Character, Integer>::new));
    }

}
