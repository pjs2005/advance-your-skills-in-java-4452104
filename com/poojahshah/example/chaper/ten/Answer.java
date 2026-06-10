package com.poojahshah.example.chaper.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write your answer here, and then test your code.
// Your job is to implement the getIndices() method.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 55 );
        int targetSum = 26;
        List<Integer> result = Answer.getIndices(numbers, targetSum);
        System.out.println(result);
    }

    // Return the indices of the numbers in the source list that add up to target
    static List<Integer> getIndices(List<Integer> source, int target) {
        // Your code goes here.
        return new ArrayList<>();
    }

}

