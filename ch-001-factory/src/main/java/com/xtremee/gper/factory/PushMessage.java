package com.xtremee.gper.factory;

/**
 * PushMessage
 *
 * @author Shen Jun
 */
public class PushMessage implements IMessage{
    @Override
    public void send(String content) {
        System.out.println("发送推送消息："+content);
    }
}
