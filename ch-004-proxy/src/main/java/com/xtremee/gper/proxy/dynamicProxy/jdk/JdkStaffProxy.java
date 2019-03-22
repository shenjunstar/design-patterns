package com.xtremee.gper.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JdkStaffProxy
 *
 * @author Shen Jun
 */
public class JdkStaffProxy implements InvocationHandler {

    private Object target;

    public JdkStaffProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    private void before(){
        System.out.println("before...");
    }

    private void after(){
        System.out.println("after...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }
}
