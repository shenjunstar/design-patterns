package com.xtremee.gper.factory.simple;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.PushMessage;
import org.junit.Test;

public class SimpleMsgFactoryTest {

    @Test
    public void create() {
        IMessage message = SimpleMsgFactory.create("mail");
        message.send("测试消息");
    }

    @Test
    public void create1() {
        IMessage message = SimpleMsgFactory.create(PushMessage.class);
        message.send("我是推送消息");
    }
}
