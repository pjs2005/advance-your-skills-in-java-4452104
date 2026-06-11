package com.poojahshah.example.chaper.other;

import java.util.List;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        String result = Answer.getRootExceptionMessage();
        System.out.println(result);
    }

    // Return the largest number in the 'numbers' array
    static String getRootExceptionMessage() {
        try {
            methodA();
        } catch (Exception e) {
            return "Exception: " + e.getMessage();
        }
        return "no exceptions!";
    }

    private static void methodA() {
        try {
            methodB();
        } catch (Exception ignored) {
            throw ignored;
        }
    }

    private static void methodB() {
        methodC();
    }

    private static void methodC() {
        throw new RuntimeException("Exception in methodC");
    }

}

