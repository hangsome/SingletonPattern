package com.test;

import com.java.SingletomPattern.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream f1 = null;
        try{

            f1 = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(f1);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream f2 = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(f2);
            s1=(SeriableSingleton) ois.readObject();
            ois.close();
            f2.close();
            f1.close();
            System.out.println(s1==s2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
