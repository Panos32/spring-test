package com.example.springboot.quotes;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuotesConfig {

    CommandLineRunner commandLineRunner(QuotesRepository repository) {
        return args -> {    
            Quotes oscarWilde = new Quotes(
                    1L,
                "Oscar Wild",
                  "To be or not to be"
                  );
                Quotes marieCurie =  new Quotes(
                    1L,
                "Marie Curie",
                  "Nothing in life is to be feared; it is only to be understood."
                  );

            repository.saveAll(List.of(oscarWilde,marieCurie)); 

        };
    }
}
