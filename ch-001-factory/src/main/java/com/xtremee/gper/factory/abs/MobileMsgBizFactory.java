package com.xtremee.gper.factory.abs;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.IReport;
import com.xtremee.gper.factory.MobileMessage;
import com.xtremee.gper.factory.MobileReport;

/**
 * MobileMsgBizFactory
 *
 * @author Shen Jun
 */
public class MobileMsgBizFactory implements IMessageBizFactory{
    @Override
    public IMessage createMessage() {
        return new MobileMessage();
    }

    @Override
    public IReport createReport() {
        return new MobileReport();
    }
}
