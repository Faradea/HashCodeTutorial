package com.example.helloworld;

import java.util.List;

public class Library {
    public List<Integer> books;
    public Integer signUpCost;
    public Integer booksPerDay;
    public Integer booksCount;

    public Library(List<Integer> books, Integer booksCount, Integer signUpCost, Integer booksPerDay) {
        this.books = books;
        this.signUpCost = signUpCost;
        this.booksPerDay = booksPerDay;
        this.booksCount = booksCount;
    }
}

