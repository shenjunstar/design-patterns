package com.xtremee.gper.factory.abs;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.IReport;
import com.xtremee.gper.factory.MailMessage;
import com.xtremee.gper.factory.MailReport;

/**
 * MailMsgBizFactory
 *
 * @author Shen Jun
 */
public class MailMsgBizFactory implements IMessageBizFactory{
    @Override
    public IMessage createMessage() {
        return new MailMessage();
    }

    @Override
    public IReport createReport() {
        return new MailReport();
    }
}
