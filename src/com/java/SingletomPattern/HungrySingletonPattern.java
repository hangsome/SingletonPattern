package com.java.SingletomPattern;

public class HungrySingletonPattern {

    //构造方法私有化
    private HungrySingletonPattern(){};

    private static final HungrySingletonPattern HUNGRY_SINGLETON_PATTERN = new HungrySingletonPattern();

    public HungrySingletonPattern getInstance(){
        return HUNGRY_SINGLETON_PATTERN;
    }

}
