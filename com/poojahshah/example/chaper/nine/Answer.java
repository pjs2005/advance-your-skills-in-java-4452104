package com.poojahshah.example.chaper.nine;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Write your answer here, and then test your code.
// Your job is to implement the findFiveOrFewer() method.

public class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        String source = "there are both smaller and bigger words here";
        List<String> result = Answer.findFiveOrFewer(source);
        result.forEach(System.out::println);;
    }

    // Return the a list of words with 5 or fewer characters
    static List<String> findFiveOrFewer(String source) {
        // Your code goes here.
        List<String> words = Arrays.stream(source.split(" ")).collect(Collectors.toList());

        return words.stream().filter(s -> s.length() <= 5).toList();
    }

}

