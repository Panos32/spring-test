package com.example.springboot.quotes;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotesRepository 
        extends JpaRepository<Quotes,Long>{


    Optional<Quotes>findById(Long id);

    Optional<Quotes> findQuotesByAuthor(String author);

   // List<Quotes> findById();

    


}
