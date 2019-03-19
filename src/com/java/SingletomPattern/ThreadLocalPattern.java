package com.java.SingletomPattern;

public class ThreadLocalPattern {
    private static final ThreadLocal<ThreadLocalPattern> threadLocal =
            new ThreadLocal<ThreadLocalPattern>(){
              @Override
              protected ThreadLocalPattern initialValue() {
                  return new ThreadLocalPattern();
              }

    };

    private ThreadLocalPattern(){};

    public ThreadLocalPattern getInstance(){
        return threadLocal.get();
    }
}
