package com.example.adventofcode.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class CampCleanup {
    static final String FILE_NAME = "C:/Users/DiChioI/IdeaProjects/IlariaDiChioAdvent-of-Code-2022/Day 4 Part 1 - Camp Cleanup/input.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        Integer counter = 0;
        while ((st = br.readLine()) != null){

            System.out.println(st);

            String parts[] = st.split(",");
            System.out.println("I'm ST.Split" + Arrays.toString(parts));
            String[] partsFirst = (parts[0].split("-"));
            System.out.println("I'm 1" + Arrays.toString(partsFirst));
            String[] partsSecond = (parts[1].split("-"));
            System.out.println("I'm 2" + Arrays.toString(partsSecond));
            Integer firstPairNum1 = Integer.parseInt(partsFirst[0]);
            System.out.println("I'm 3" + Arrays.toString(partsFirst));
            Integer firstPairNum2 = Integer.parseInt(partsFirst[1]);
            System.out.println("I'm 4" + Arrays.toString(partsSecond));

            Integer secondPairNum1 = Integer.parseInt(partsSecond[0]);
            Integer secondPairNum2 = Integer.parseInt(partsSecond[1]);

            if( (Math.abs(firstPairNum1 - firstPairNum2)) > (Math.abs(secondPairNum1 - secondPairNum2))  ){

                if (firstPairNum1 <= secondPairNum1 && firstPairNum2 >=secondPairNum2){
                    counter++;
                }
            }
            else {
                if (firstPairNum1 >= secondPairNum1 && firstPairNum2 <=secondPairNum2){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}