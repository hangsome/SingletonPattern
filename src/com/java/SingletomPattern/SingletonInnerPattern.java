package com.java.SingletomPattern;

public class SingletonInnerPattern {

    private SingletonInnerPattern(){
        if (LazyHodler.lazy!=null){
            throw new RuntimeException("���ܴ������ʵ��");
        }
    };

    public static final SingletonInnerPattern getInstance(){
        return LazyHodler.lazy;
    }

    private static class LazyHodler{
        private static final SingletonInnerPattern lazy = new SingletonInnerPattern();
    }
}
