package com.example.springboot.quotes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotesService {

    private final QuotesRepository quotesRepository;

    @Autowired
    public QuotesService(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }


    public List<Quotes> getQuotes() {
        return quotesRepository.findAll();
    }

  //  public Quotes findById(){
  //   return quotesRepository.findById();
  //  }

    public void addNewQuote(Quotes quotes){
        Optional<Quotes> quotesOptional = quotesRepository.
        findQuotesByAuthor(quotes.getAuthor());
        if (quotesOptional.isPresent()) {
            throw new IllegalStateException("Author exists");
        }
        quotesRepository.save(quotes);
    }


    public void deleteQuotes(Long quotesId) {
            boolean exists = quotesRepository.existsById(quotesId);
            if (!exists){
                throw new IllegalStateException("Quote with id " + quotesId + "does not exist");
            }
            quotesRepository.deleteById(quotesId);
    }



}