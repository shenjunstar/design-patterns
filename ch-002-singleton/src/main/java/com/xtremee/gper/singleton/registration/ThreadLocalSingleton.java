package com.xtremee.gper.singleton.registration;

/**
 * ThreadLocalSingleton
 *  同一个线程内是单例的，不同线程间获取到的实例不一样
 * @author Shen Jun
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> t = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return t.get();
    }

}
