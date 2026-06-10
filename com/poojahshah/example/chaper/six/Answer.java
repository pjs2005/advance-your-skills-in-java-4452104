package com.poojahshah.example.chaper.six;

import java.util.*;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the number of occurrences of word in source
    static int getOccurrences(String source, String word) {
        // Your code goes here.
        String cleanString = source.replaceAll("\\.", " ");

        return (int) Arrays
                .stream(cleanString.split(" "))
                .filter(s -> s.equalsIgnoreCase(word))
                .count();
    }

    public static void main(String[] args) {
        String source = "Here is an example. Right here.";
        String word = "here";
        int result = Answer.getOccurrences(source, word);
        System.out.println(result);
    }

}
