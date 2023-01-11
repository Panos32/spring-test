package com.example.springboot.quotes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/quote")
public class QuotesController {


    private final QuotesService quoteService;

    @Autowired
    public QuotesController(QuotesService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping
	public List<Quotes> getQuotes() {
        return quoteService.getQuotes();
	}

    
}
