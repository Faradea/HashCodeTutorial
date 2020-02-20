package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ResultSender {
    static Integer librariesCount;
    static List<ProcessedLibrary> processedLibraries;
    private static List<List<Integer>> output;

    public static void generateOutput() {
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(librariesCount);
        output.add(firstLine);

        processedLibraries.forEach( processedLibrary ->
        {
            List<Integer> summaryLine = new ArrayList<>();
            summaryLine.add(processedLibrary.scannedBooksCount);
            output.add(summaryLine);

            List<Integer> contentLine = processedLibrary.scannedBooks;
            output.add(contentLine);
        }
        );

        System.out.println("Printing result:");
        System.out.println(output);
    }
}
