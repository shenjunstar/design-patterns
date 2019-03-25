package com.xtremee.gper.proxy.dynamicproxy.jdk;

import com.xtremee.gper.proxy.GoodStaff;
import com.xtremee.gper.proxy.IStaff;
import org.junit.Test;

public class JdkStaffProxyTest {

    @Test
    public void doSomething() {
        IStaff staff = new GoodStaff();
        JdkStaffProxy jdkStaffProxy = new JdkStaffProxy(staff);
        IStaff instance = (IStaff) jdkStaffProxy.getInstance();
        instance.doSomething();
    }
}
