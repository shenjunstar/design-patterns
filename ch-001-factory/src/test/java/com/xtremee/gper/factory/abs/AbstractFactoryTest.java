package com.xtremee.gper.factory.abs;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.IReport;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test
    public void test() {
        IMessageBizFactory bizFactory = new MailMsgBizFactory();
        IMessage message = bizFactory.createMessage();
        IReport report = bizFactory.createReport();
        message.send("0001:我是测试");
        String result = report.reportResult("0001");
        System.out.println(result);
    }

}
