package com.poojahshah.example.chaper.next4;

import java.util.Arrays;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
// Call the answer code.
        String result = Answer.transformValues(numbers);
        System.out.println(result);
    }

    // Transform an array of numbers into a comma-delimited list
    // using functional programming.
    static String transformValues(int[] numbers) {
        // Your code goes here.

        return Arrays
                .stream(numbers)
                .mapToObj(s -> String.valueOf(s))
                .toList().stream()
                .collect(Collectors.joining(","));
        
    }

}

