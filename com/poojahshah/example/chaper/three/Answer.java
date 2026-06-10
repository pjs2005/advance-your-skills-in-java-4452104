package com.poojahshah.example.chaper.three;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Add annotation to this method
    @MethodDescription("findAnswer")
    public static void findAnswer() {

    }

}

// The implementation of the annotation goes here
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MethodDescription {
    String value();

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Emailvalidation {
    String message() default "Invalid email format";

}