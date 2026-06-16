package com.poojahshah.example.chaper.next;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Create constants representing the four available math functions
    public static final String ADD = "ADD";
    public static final String SUBTRACT = "SUBTRACT";
    public static final String MULTIPLY = "MULTIPLY";
    public static final String DIVIDE = "DIVIDE";

    public static void main(String[] args) {
        float value1 = 10f;
        float value2 = 20f;
        Map<String, Float> results = Answer.calculate(value1, value2);
        System.out.println(results);
    }


    // Do mathematical calculations using lambda expressions
    public static Map<String, Float> calculate(float value1, float value2) {

        // Your code goes here
        // Create 4 instances of the BiFunction interface referencing lambda expressions

        // Map object for holding the results
        Map<String, Float> results = new HashMap<>();

        BiFunction<Float,Float,Float> addition = (a, b) -> a + b;

        BiFunction<Float,Float,Float> substract = (a, b) -> a - b;

        BiFunction<Float,Float,Float> muliple = (a, b) -> a * b;

        BiFunction<Float,Float,Float> divide = (a, b) -> a / b;

        results.put(ADD, addition.apply(value1,  value2));
        results.put(SUBTRACT, substract.apply(value1,  value2));
        results.put(MULTIPLY, muliple.apply(value1,  value2));
        results.put(DIVIDE, divide.apply(value1,  value2));

        // Populate the map here with the results of the 4 math operations

        return results;
    }

}