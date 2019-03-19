package com.test;

import com.java.SingletomPattern.EnumSingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonPatterTest {

    public static void main(String[] args) {

//        EnumSingletonPattern enum1 = (EnumSingletonPattern) EnumSingletonPattern.getInstance();
//
//        EnumSingletonPattern enum2 = (EnumSingletonPattern) EnumSingletonPattern.getInstance();
//
//        System.out.println(enum1==enum2);

        EnumSingletonPattern e1 = null;
        EnumSingletonPattern e2 = (EnumSingletonPattern) EnumSingletonPattern.getInstance();

        try {
            FileOutputStream f1 = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(f1);
            oos.writeObject(e2);
            oos.flush();
            f1.close();
            oos.close();

            FileInputStream f2 = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(f2);
            e1 = (EnumSingletonPattern) ois.readObject();
            f2.close();
            ois.close();
            System.out.println(e1==e2);



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
