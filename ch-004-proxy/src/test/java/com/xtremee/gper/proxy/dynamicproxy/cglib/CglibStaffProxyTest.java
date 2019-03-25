package com.xtremee.gper.proxy.dynamicproxy.cglib;

import com.xtremee.gper.proxy.GoodStaff;
import org.junit.Test;

import static org.junit.Assert.*;

public class CglibStaffProxyTest {

    @Test
    public void doSomething() {
        CglibStaffProxy proxy = new CglibStaffProxy();
        GoodStaff instance = (GoodStaff) proxy.getInstance(GoodStaff.class);
        instance.doSomething();
    }

}
