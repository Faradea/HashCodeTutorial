package com.example.helloworld;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        readInputFile("./resources/a_example.in");
    }

    private static void readInputFile(String filePath) {
        System.out.println("Reading file...");
        List<Integer> list = null;
        String content = "";
        List<List<Integer>> listOfLists = null;
        try {
            //content = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
            Files.lines(Paths.get(filePath))
                    .forEach( line ->
                            // ToDo распарсить строку чисел через пробелы
                            System.out.println(Integer.parseInt(line))
                    );
//            list = Files.lines(Paths.get(filePath))
//                    .map(Integer::parseInt)
//                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Printing result");
        //System.out.println(list);
    }
}
