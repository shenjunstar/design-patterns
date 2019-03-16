package com.xtremee.gper.singleton.lazy;

/**
 * LazySingleton
 * 这种写法在多线程环境下会出现多例情况
 * @author Shen Jun
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
