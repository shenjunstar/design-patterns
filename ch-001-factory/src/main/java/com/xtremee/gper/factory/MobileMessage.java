package com.xtremee.gper.factory;

/**
 * MobileMessage
 *
 * @author Shen Jun
 */
public class MobileMessage implements IMessage{
    @Override
    public void send(String content) {
        System.out.println("发送手机短信："+content);
    }
}
