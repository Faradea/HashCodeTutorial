package com.example.helloworld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HashCodeCompetition {
    int days = 0;
    List<Integer> booksList = new ArrayList<Integer>();
    List<Library> librariesList = new ArrayList<Library>();

    Integer x = 5;
    Library library = new Library(new ArrayList<Integer>(x), 5, 5);

    public static void main(String[] args) {
        readInputFile("./resources/a_example.in");
    }

    private static List<List<Integer>> readInputFile(String filePath) {
        System.out.println("Reading file...");
        int days = 0;


        List<List<Integer>> listOfLists = new ArrayList<>();
        try {
            Files.lines(Paths.get(filePath))
                    .forEach( line ->
                            listOfLists.add(parseString(line))
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfLists;
    }

    private static List<Integer> parseString(String str) {
        String[] strMas= str.split("[ ]"); //получили массив без пробелов
        List<Integer> result = new ArrayList<>(strMas.length);
        for (int i = 0; i < strMas.length; i++) {
            result.add(Integer.parseInt(strMas[i]));
        }
        return result;
    }
}
