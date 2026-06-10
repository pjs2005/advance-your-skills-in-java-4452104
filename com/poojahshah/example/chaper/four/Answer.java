package com.poojahshah.example.chaper.four;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method and the FactorialTask class.

class Answer {

    public static void main(String[] args) {
        // This is how your code will be called.
        // You can edit this code to try different testing cases.
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<Integer, BigInteger> result = Answer.findAnswer(numbers);
        System.out.println(result);
        result.forEach((integer, bigInteger) -> System.out.println(integer + " " + bigInteger));
    }

    static Map<Integer, BigInteger> findAnswer(List<Integer> numbers) {
        // Your code goes here.
        Map<Integer, BigInteger> result = new HashMap<>(numbers.size());
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        for (Integer value : numbers) {
            FactorialTask factorialTask = new FactorialTask(value);
            Future<Map.Entry<Integer, BigInteger>> future = executor.submit(factorialTask);

            try {
                Map.Entry<Integer, BigInteger> calc = future.get();
                result.put(calc.getKey(), calc.getValue());

            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
        return result;
    }
}

class FactorialTask implements Callable<Map.Entry<Integer, BigInteger>> {

    private final Integer number;

    FactorialTask(Integer number) {
        this.number = number;
    }

    @Override
    public Map.Entry<Integer, BigInteger> call() throws Exception {
        // Your code goes here.
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return Map.entry(number, res);
    }
}


