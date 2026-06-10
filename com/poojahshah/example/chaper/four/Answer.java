package com.poojahshah.example.chaper.four;

// Java code below

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method and the FactorialTask class.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        // This is how your code will be called.
// You can edit this code to try different testing cases.
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<Integer, BigInteger> result = Answer.findAnswer(numbers);
    }

    static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
        // Your code goes here.
        return null;
    }
}

class FactorialTask implements Callable<Map.Entry<Integer, BigInteger>> {

    // Some of your code goes here

    @Override
    public Map.Entry<Integer, BigInteger> call() throws Exception {
        // Your code goes here.
        return null;
    }
}


