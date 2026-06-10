package com.poojahshah.example.chaper.seven;

import java.util.*;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( -1, 7, 17, 13, 19, 5 );
        List<Integer> result = Answer.getReversed(numbers);
        System.out.println(result);
    }

    // Return a new list in reversed order
    static List<Integer> getReversed(List<Integer> source) {
        // Your code goes here.

//        List<Integer> result = source
//                .stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        return result;

        return source.reversed();
    }

}