package com.example.springboot.quotes;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuotesService {

    public List<Quotes> getQuotes() {
    return List.of(
        new Quotes (1L,
                "Oscar Wild",
                "To be or not to be")
    );
    }
}