package com.xtremee.gper.proxy.staticProxy;

import com.xtremee.gper.proxy.IStaff;

/**
 * JdkStaffProxy
 *
 * @author Shen Jun
 */
public class StaffProxy {

    private IStaff staff;

    public StaffProxy(IStaff staff) {
        this.staff = staff;
    }

    private void before(){
        System.out.println("做事之前先洗手");
    }

    private void after(){
        System.out.println("完事之后也要洗手");
    }

    public void doSomething(){
        before();
        staff.doSomething();
        after();
    }

}
