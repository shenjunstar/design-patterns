package com.xtremee.gper.factory.abs;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.IReport;
import com.xtremee.gper.factory.PushMessage;
import com.xtremee.gper.factory.PushReport;

/**
 * PushMsgBizFactory
 *
 * @author Shen Jun
 */
public class PushMsgBizFactory implements IMessageBizFactory{
    @Override
    public IMessage createMessage() {
        return new PushMessage();
    }

    @Override
    public IReport createReport() {
        return new PushReport();
    }
}
