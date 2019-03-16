package com.xtremee.gper.factory.method;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.PushMessage;

/**
 * PushMessageFactory
 *
 * @author Shen Jun
 */
public class PushMessageFactory implements IMessageFactory{
    @Override
    public IMessage create() {
        return new PushMessage();
    }
}
