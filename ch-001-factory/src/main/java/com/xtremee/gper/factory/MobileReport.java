package com.xtremee.gper.factory;

/**
 * MobileReport
 *
 * @author Shen Jun
 */
public class MobileReport implements IReport{
    @Override
    public String reportResult(String msgId) {
        return "["+msgId+"]短信消息发送成功";
    }
}
