package com.example.springboot.quotes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/quotes")
public class QuotesController {


    private final QuotesService quotesService;

    @Autowired
    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping(path = "/getall")
	public List<Quotes> getQuotes() {
        return quotesService.getQuotes();
	}

   // @GetMapping( path = "/get/{id}")
   // public Quotes one (@PathVariable Long quotesId){
   //     return quotesService.findById();
   //}


    @PostMapping
    public void registerNewQuote (@RequestBody Quotes quotes) {
        quotesService.addNewQuote(quotes);
    
    }

    @DeleteMapping(path = "{quotesId}")
    public void deleteQuotes (@PathVariable("quotesId") Long quotesId){
        quotesService.deleteQuotes(quotesId);
    }

}
