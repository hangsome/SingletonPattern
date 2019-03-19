package com.test;

import com.java.SingletomPattern.EnumSingletonPattern;

import java.lang.reflect.Constructor;

public class EnumReflctTest {
    public static void main(String[] args) {

        try {
            Class clazz = EnumSingletonPattern.class;

            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
