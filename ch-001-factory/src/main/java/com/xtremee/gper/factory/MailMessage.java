package com.xtremee.gper.factory;

/**
 * MailMessage
 *
 * @author Shen Jun
 */
public class MailMessage implements IMessage{
    @Override
    public void send(String content) {
        System.out.println("发送邮件消息:"+content);
    }
}
