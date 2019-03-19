package com.java.SingletomPattern;

public enum  EnumSingletonPattern {

    INSTANCE;



    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public static Object getInstance(){
        return INSTANCE;
    }
}
