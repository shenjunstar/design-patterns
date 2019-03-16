package com.xtremee.gper.singleton.hungry;

import java.io.Serializable;

/**
 * HungrySerializableSingleton
 * 加上resolve就不会出现序列化破坏单例的情况
 * 实际上实例化了两次，只不过新创建的对象没有被返回而已。
 * 如果创建对象的动作发生频率增大，就意味着内存分配开销也就随之增大
 * 为了解决这个问题，注册式单例派上用场了
 * @author Shen Jun
 */
public class HungrySerializableSingleton implements Serializable {

    private static final long serialVersionUID = 233707293281614801L;

    private static HungrySerializableSingleton singleton = new HungrySerializableSingleton();

    private HungrySerializableSingleton(){}

    public static HungrySerializableSingleton getInstance(){
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
