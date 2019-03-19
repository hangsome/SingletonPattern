package com.java.SingletomPattern;

public class HungrySingletonPattern {

    //���췽��˽�л�
    private HungrySingletonPattern(){};

    private static final HungrySingletonPattern HUNGRY_SINGLETON_PATTERN = new HungrySingletonPattern();

    public HungrySingletonPattern getInstance(){
        return HUNGRY_SINGLETON_PATTERN;
    }

}
