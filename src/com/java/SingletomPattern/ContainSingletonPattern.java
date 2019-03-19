package com.java.SingletomPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainSingletonPattern {

    private ContainSingletonPattern(){};

    private static final Map<Object,String> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String name) {
        synchronized (ioc) {
            if (!ioc.containsKey(name)) {
                Object obj = null;
                try {
                    obj = Class.forName(name).newInstance();
                    ioc.put(obj, name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(name);
            }
        }
    }
}
