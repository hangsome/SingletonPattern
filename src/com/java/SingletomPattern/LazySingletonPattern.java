package com.java.SingletomPattern;

public class LazySingletonPattern {

    private LazySingletonPattern(){
    };

    private static LazySingletonPattern lazy = null;

    public static LazySingletonPattern getInstance(){
        if (lazy==null){
            synchronized (LazySingletonPattern.class) {
                if (lazy==null){
                    lazy = new LazySingletonPattern();
                }
            }
        }
        return lazy;
    }
}
