package com.example.springboot.Quote;

import java.util.List;

public class QuoteService {


    public List<Quote> getQuote() {
    return List.of(
        new Quote (1L,
                "Oscar",
                "To be or not to be")
    );
    }
}