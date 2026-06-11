package com.poojahshah.example.chaper.other;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        String result = Answer.getAllExceptions();
        System.out.println(result);
    }

    // Return all the messages for all exceptions thrown
    static String getAllExceptions() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<String> exceptions = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    Future<?> result = executorService.submit(Answer::getTask);
                    result.get();
                    System.out.println("test");
                } catch (RuntimeException e) {
                    exceptions.add(e.getMessage());
                } catch (ExecutionException e) {
                    exceptions.add(e.getMessage());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            executorService.shutdown();
        }
        return exceptions.toString();
    }

    public static void getTask() throws RuntimeException {
        String threadName = Thread.currentThread().getName();
        throw new RuntimeException(
                "Exception in thread: " + threadName);
    }

}


