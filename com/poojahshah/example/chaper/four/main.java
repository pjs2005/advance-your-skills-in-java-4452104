package com.poojahshah.example.chaper.four;

import java.util.concurrent.ThreadPoolExecutor;

public class main {

    public static void main(String[] args) {
        System.out.println("Hello from Main thread: " + Thread.currentThread().getId());
        Thread thread = new Thread(new myRunable());
        Thread thread2 = new Thread(new myRunable());
        thread.start();
        thread2.start();


    }

}
