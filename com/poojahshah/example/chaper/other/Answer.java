package com.poojahshah.example.chaper.other;

import java.io.PrintWriter;
import java.io.StringWriter;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        String result = Answer.getRootException();
        System.out.println(result);
    }

    // Return the originating Exception message
    static String getRootException()  {
        try {
            methodA();
        } catch (Exception e) {
            Throwable cause = null;
            Throwable result = e;
            while(null != (cause = result.getCause())  && (result != cause) ) {
                result = cause;
            }
            return result.toString();
        }
        return "";
    }

    static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            throw new RuntimeException("Exception in methodA", e);
        }

    }

    static void methodB() {
        try {
            methodC();
        } catch (Exception e) {
            throw new RuntimeException("Exception in methodB", e);
        }
    }

    static void methodC() {
        throw new RuntimeException("Exception in methodC");
    }

    static String getStackTraceAsString(Exception e) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}



