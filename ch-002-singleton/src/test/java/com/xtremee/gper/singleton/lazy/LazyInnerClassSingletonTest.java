package com.xtremee.gper.singleton.lazy;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

public class LazyInnerClassSingletonTest {

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
     * 尝试破坏单例
     */
    @Test
    public void hack(){
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
}
