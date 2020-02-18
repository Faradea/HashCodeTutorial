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
        sendResultToJudgeSystem(outputData);
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

    private static void sendResultToJudgeSystem(List<List<Integer>> outputData) {
        // ToDo здесь должна быть отправка результата на сервер
    }
}
