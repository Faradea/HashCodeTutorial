package com.example.helloworld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ResultSender {
//    static Integer librariesCount;
//    static List<ProcessedLibrary> processedLibraries;
//    private static List<List<Integer>> output;

    public static void generateOutput(Integer librariesCount, List<ProcessedLibrary> processedLibraries) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();

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

        String out=output.toString()
                .replace("], [","\n")
                .replaceAll("\\[|\\]|,","");
        try {
            Files.write(Paths.get("./resources/a_example.out"), out.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
