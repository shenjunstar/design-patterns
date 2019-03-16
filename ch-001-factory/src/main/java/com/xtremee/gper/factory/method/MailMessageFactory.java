package com.xtremee.gper.factory.method;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.MailMessage;

/**
 * MailMessageFactory
 *
 * @author Shen Jun
 */
public class MailMessageFactory implements IMessageFactory{
    @Override
    public IMessage create() {
        return new MailMessage();
    }
}
