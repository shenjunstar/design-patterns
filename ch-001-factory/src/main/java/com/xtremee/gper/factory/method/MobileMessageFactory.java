package com.xtremee.gper.factory.method;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.MobileMessage;

/**
 * MobileMessageFactory
 *
 * @author Shen Jun
 */
public class MobileMessageFactory implements IMessageFactory{
    @Override
    public IMessage create() {
        return new MobileMessage();
    }
}
