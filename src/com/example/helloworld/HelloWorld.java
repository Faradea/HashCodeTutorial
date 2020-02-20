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
        System.out.println("Write result file...");

        // outputData = [[17, 4], [2, 5, 6, 8]]
        //
        // ---->
        //
        // 17 4
        // 2 5 6 8

        /*String out=outputData.toString()
                .replace("], [","\n")
                .replaceAll("\\[|\\]|,","");

        final String[] out1 = {""};
        outputData.forEach(
             line ->
             {
                 line.forEach(element -> {
                             out1[0] = out1[0].concat("" + element).concat(" ");
                         }
                 );
                 out1[0] = out1[0].trim();
                 out1[0] = out1[0].concat("\n");
             }
            );
            out1[0] = out1[0].trim();



        System.out.println(out1[0]);
            try {
                Files.write(Paths.get(filePath), out1[0].getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
*/

    }
}
