package com.xtremee.gper.singleton.lazy;

/**
 * LazyInnerClassSingleton
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized 性能问题
 * 默认使用LazyInnerClassSingleton 的时候，会先初始化内部类
 * 如果没使用的话，内部类是不加载的
 * @author Shen Jun
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY_HOLDER!=null){
            throw new RuntimeException("非法操作");
        }
    }

    public static final LazyInnerClassSingleton getInstance() throws IllegalAccessException {
        return LazyHolder.LAZY_HOLDER;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY_HOLDER = new LazyInnerClassSingleton();
    }


}
