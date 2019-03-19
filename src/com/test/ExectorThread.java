package com.test;

import com.java.SingletomPattern.LazySingletonPattern;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingletonPattern lazySingletonPattern = LazySingletonPattern.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+ lazySingletonPattern);
    }
}
