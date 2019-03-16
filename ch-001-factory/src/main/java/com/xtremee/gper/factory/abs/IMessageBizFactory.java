package com.xtremee.gper.factory.abs;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.IReport;

/**
 * IMessageBizFactory
 *
 * @author Shen Jun
 */
public interface IMessageBizFactory {

    IMessage createMessage();

    IReport createReport();

}
