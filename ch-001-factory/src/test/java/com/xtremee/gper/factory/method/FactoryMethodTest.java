package com.xtremee.gper.factory.method;

import com.xtremee.gper.factory.IMessage;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @Test
    public void create() {
        IMessageFactory messageFactory = new MobileMessageFactory();
        IMessage message = messageFactory.create();
        message.send("我是测试消息");
    }
}
