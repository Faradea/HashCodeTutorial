package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    static List<Integer> booksList = new ArrayList<Integer>();
    static List<Library> librariesList = new ArrayList<Library>();

    public static void main(String[] args) {
        int days = 0;
        int daysLeft=0;

        List<Integer> processedArray = new ArrayList<Integer>();
        processedArray.add(2);
        processedArray.add(1);
        processedArray.add(0);
        processedArray.remove(2);
        System.out.println(processedArray);

        //processLib(processedArray);
    }
    public static int processLib(List<Integer> processedArray)
    {
        int daysLeft=0;
        for(int i=0; i < librariesList.size(); i++) {
            if(processedArray.indexOf(i)>=0)
                continue;
            processedArray.add(i);
            daysLeft+=librariesList.get(i).signUpCost;
            //int daysToProcess=librariesList.get(i).booksCount/librariesList.get(i).booksPerDay;
            //int devider=(librariesList.get(i).booksCount%librariesList.get(i).booksPerDay>0?1:0);
            ///List<SomeBean> newList = new ArrayList<SomeBean>(otherList);
            processLib(processedArray);
            processedArray.remove(i);

        }
        return 0;
    }
}
