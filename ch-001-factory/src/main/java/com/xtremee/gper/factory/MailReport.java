package com.xtremee.gper.factory;

/**
 * MailReport
 *
 * @author Shen Jun
 */
public class MailReport implements IReport{
    @Override
    public String reportResult(String msgId) {
        return "["+msgId+"]消息发送成功";
    }
}
