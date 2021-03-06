package com.example.helloworld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HashCodeCompetition {
    Integer days = 0;
    List<Integer> booksList = new ArrayList<Integer>();
    List<Library> librariesList = new ArrayList<Library>();

    public static void main(String[] args) {
        List<List<Integer>> inputData = readInputFile("./resources/a_example.in");
        //List<List<Integer>> inputData = readInputFile("./resources/b_read_on.txt");
        //List<List<Integer>> inputData = readInputFile("./resources/c_incunabula.txt");
        //List<List<Integer>> inputData = readInputFile("./resources/d_tough_choices.txt");
        //List<List<Integer>> inputData = readInputFile("./resources/e_so_many_books.txt");
        //List<List<Integer>> inputData = readInputFile("./resources/f_libraries_of_the_world.txt");
        System.out.println(inputData);

        parseInputFile(inputData);
//        Integer x = 5;
//        Library library = new Library(new ArrayList<Integer>(x), 5, 5);
    }

    private static List<List<Integer>> readInputFile(String filePath) {
        System.out.println("Reading file...");
        List<List<Integer>> listOfLists = new ArrayList<>();
        try {
            Files.lines(Paths.get(filePath))
                    .forEach( line ->
                            {
                                if (line.isEmpty()) return;
                                listOfLists.add(parseString(line));
                            }

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

    private static void parseInputFile(List<List<Integer>> inputData) {
        Integer booksTotal = inputData.get(0).get(0);
        Integer librariesTotal = inputData.get(0).get(1);
        Integer days = inputData.get(0).get(2);

        List<Integer> booksList = inputData.get(1);
        List<Library> librariesList = new ArrayList<Library>();

        for (int i = 2; i < inputData.size(); i = i + 2) {

            List<Integer> booksInLibrary = inputData.get(i+1);

            List<Integer> summary = inputData.get(i);
            Library library = new Library(booksInLibrary, summary.get(0), summary.get(1), summary.get(2));
            librariesList.add(library);
        }

        System.out.println("days = " + days);
        System.out.println("booksList = " + booksList);
        System.out.println("librariesList: size = " + librariesList.size());
        librariesList.forEach(library ->
                System.out.println("Library: booksCount =" + library.booksCount + ", booksPerDay = " + library.booksPerDay + ", signUpCost = " + library.signUpCost + ", books = " + library.books));

        Calculation.booksList = booksList;
        Calculation.librariesList = librariesList;
        Calculation.days = days;
        List<Integer> processedArray = new ArrayList<Integer>();
        Calculation.processLib(processedArray,0,0);
        System.out.println("i");
//        ResultSender.librariesCount = 50;
//        List<ProcessedLibrary> processedLibraries = new ArrayList<ProcessedLibrary>;
//        ProcessedLibrary processedLibrary = ProcessedLibrary()
//        ResultSender.processedLibraries = ArrayList<>
        Calculation.processLib(processedArray,0);

        List<ProcessedLibrary> processedLibraries = new ArrayList<ProcessedLibrary>();
        List<Integer> processedBooks = new ArrayList<Integer>();
        processedBooks.add(8888);
        processedBooks.add(7777);
        ProcessedLibrary processedLibrary = new ProcessedLibrary(22, processedBooks);
        processedLibraries.add(processedLibrary);
        processedLibraries.add(processedLibrary);

        ResultSender.generateOutput(50, processedLibraries);
    }
}
