package com.xtremee.gper.singleton.lazy;

import com.xtremee.gper.singleton.hungry.HungrySerializableSingleton;
import com.xtremee.gper.singleton.registration.EnumSingleton;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {

    @Test
    public void getInstance() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(LazyInnerClassSingleton.getInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 尝试反射破坏单例
     */
    @Test
    public void reflectHack(){
        try {
            Class<LazyInnerClassSingleton> singletonClass = LazyInnerClassSingleton.class;
            Constructor<LazyInnerClassSingleton> constructor = singletonClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazyInnerClassSingleton s1 = constructor.newInstance();
            LazyInnerClassSingleton s2 = constructor.newInstance();
            System.out.println(s1 == s2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 序列化破坏单例
     */
    @Test
    public void serializeHack(){
        HungrySerializableSingleton s1 = HungrySerializableSingleton.getInstance();
        HungrySerializableSingleton s2;
        try {
            FileOutputStream fos = new FileOutputStream("HungrySerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (HungrySerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            Assert.assertEquals(s1,s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 序列化破坏枚举单例
     */
    @Test
    public void serializeHackRegistration(){
        EnumSingleton s1 = EnumSingleton.getInstance();
        s1.setData(new Object());
        EnumSingleton s2;
        try {
            FileOutputStream fos = new FileOutputStream("HungrySerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
