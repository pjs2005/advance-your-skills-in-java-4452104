package com.poojahshah.example.chaper.eigth;


import java.util.*;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        double result = Answer.getAverage(numbers);
        System.out.println(result);
    }

    // Return the average value of the source list
    static double getAverage(List<Integer> source) {
        // Your code goes here.
        int total = source.stream().mapToInt(Integer::intValue).sum();
        return source.stream().mapToInt(Integer::intValue).sum() / source.size();
    }
}