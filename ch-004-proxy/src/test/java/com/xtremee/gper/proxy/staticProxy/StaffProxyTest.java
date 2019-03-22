package com.xtremee.gper.proxy.staticProxy;

import com.xtremee.gper.proxy.GoodStaff;
import com.xtremee.gper.proxy.IStaff;

import static org.junit.Assert.*;

public class StaffProxyTest {

    @org.junit.Test
    public void doSomething() {
        IStaff staff = new GoodStaff();
        StaffProxy staffProxy = new StaffProxy(staff);
        staffProxy.doSomething();
    }
}
