package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ResultSender {
    static Integer librariesCount;
    static List<ProcessedLibrary> processedLibraries;
    static List<List<Integer>> output;

    public static void generateOutput() {
        List<Integer> firstLine = new ArrayList<>(librariesCount);
        output.add(firstLine);

        //processedLibraries.forEach();
    }
}
