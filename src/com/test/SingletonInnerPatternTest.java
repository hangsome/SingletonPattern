package com.test;

import com.java.SingletomPattern.LazySingletonPattern;
import com.java.SingletomPattern.SingletonInnerPattern;

import java.lang.reflect.Constructor;

public class SingletonInnerPatternTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = SingletonInnerPattern.class;

            Constructor c = clazz.getDeclaredConstructor(null);

            c.setAccessible(true);

            Object o1 = c.newInstance();

            Object o2 = c.newInstance();

            System.out.println(o1==o2);

            SingletonInnerPattern s1 = SingletonInnerPattern.getInstance();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
