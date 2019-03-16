package com.xtremee.gper.factory;

/**
 * IReport
 *
 * @author Shen Jun
 * @date 2019/3/16
 */
public interface IReport {

    /**
     * 获取消息发送结果报告
     * @param msgId
     * @return
     */
    String reportResult(String msgId);

}
