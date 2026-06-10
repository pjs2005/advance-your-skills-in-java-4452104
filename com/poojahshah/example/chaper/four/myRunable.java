package com.poojahshah.example.chaper.four;

public class myRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread: " + Thread.currentThread().getId());
        for (int i = 0; i < 10000;i++){

        }

    }
}
