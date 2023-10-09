package com.example.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class SymbolFrequencyApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void appTest() throws Exception {
        mockMvc.perform(
                        get("/api/calc")
                                .content("aaassss"))
                .andExpect(jsonPath("a").isNumber())
                .andExpect(jsonPath("a").value("3"))
                .andExpect(jsonPath("s").isNumber())
                .andExpect(jsonPath("s").value("4"));
    }

}