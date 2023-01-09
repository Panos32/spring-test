package com.example.springboot.Quote;



public class Quote{

    private Long id;
    private String author;
    private String text;


    public Quote (Long id, String author, String text){
        this.id = id;
        this.author = author;
        this.text = text;      
    }

    
    public Quote(){}

    public Quote (String author, String text){
        this.author = author;
        this.text = text;      
    }



    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public String getAuthor(){ return author;}
    public void setAuthor (String author) {this.author = author;}
    public String getText(){return text;}
    public void setText(String text) {this.text = text;}

    @Override
    public String toString () {
        return "Author{" + 
                "id=" + id +
                ", text=" + text +
                '}';
    }




}