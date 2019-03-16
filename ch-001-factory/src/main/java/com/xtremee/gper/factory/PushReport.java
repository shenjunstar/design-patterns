package com.xtremee.gper.factory;

/**
 * PushReport
 *
 * @author Shen Jun
 */
public class PushReport implements IReport{
    @Override
    public String reportResult(String msgId) {
        return "["+msgId+"]推送消息发送成功";
    }
}
