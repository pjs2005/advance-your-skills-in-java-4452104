package com.poojahshah.example.chaper.one;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {



    public static void main(String[] args) {
        Predicate<String> largerThan5 = s -> s.length() > 5;
        boolean result = largerThan5.test("hello");
        System.out.println(result);

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello from functional programming");

        doSomthing(largerThan5);
    }

    public static void doSomthing(Predicate<String> p){
        System.out.println(p.test("doSomehting"));
    }
}
