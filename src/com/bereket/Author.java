package com.bereket;

public class Author {

    private String authorsName;
    private String [] authorsBooks;


    public Author(String authorsName, String[] authorsBooks) {
        this.authorsName = authorsName;
        this.authorsBooks = authorsBooks;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String[] getAuthorsBooks() {
        return authorsBooks;
    }

    public void setAuthorsBooks(String[] authorsBooks) {
        this.authorsBooks = authorsBooks;
    }
}
