package com.bereket;

public class Main {

    public static void main(String[] args) {


        String name = "Brian";
        String authorsBooks [] = {"book1","book2","book3"};
        Author author1 = new Author("Brian",authorsBooks);
        System.out.println(author1.getAuthorsName());
    }
}
