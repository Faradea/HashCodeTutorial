package com.example.helloworld;

import java.util.List;

public class ProcessedLibrary {
    public Integer scannedBooksCount;
    public List<Integer> scannedBooks;

    public ProcessedLibrary(Integer scannedBooksCount, List<Integer> scannedBooks) {
        this.scannedBooksCount = scannedBooksCount;
        this.scannedBooks = scannedBooks;
    }
}
