package com.example.helloworld;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<List<Integer>> inputData = readInputFile("./resources/a_example.in");
        System.out.println(inputData);

        List<List<Integer>> outputData = inputData;
        //System.out.println(outputData.get(1).get(2));
        writeResultFile(outputData, "./resources/a_example.out");
    }

    private static List<List<Integer>> readInputFile(String filePath) {
        System.out.println("Reading file...");
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

    private static void writeResultFile(List<List<Integer>> outputData, String filePath) {
        // Доделать форматирование
        System.out.println("Write result file...");
        String stringOut = outputData.toString();
        try {
            Files.write(Paths.get(filePath), stringOut.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
