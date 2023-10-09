package com.example.demo.controller;

import com.example.demo.service.SymbolFrequencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SymbolFrequencyController {

    private final SymbolFrequencyService service;

    @Autowired
    public SymbolFrequencyController(SymbolFrequencyService service) {
        this.service = service;
    }

    @GetMapping("/calc")
    public Map<Character, Integer> calcSymbol(@RequestBody String s) {
        return service.calcSymbol(s);
    }

}
