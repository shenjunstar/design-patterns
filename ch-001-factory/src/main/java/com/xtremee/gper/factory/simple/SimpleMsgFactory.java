package com.xtremee.gper.factory.simple;

import com.xtremee.gper.factory.IMessage;
import com.xtremee.gper.factory.MailMessage;
import com.xtremee.gper.factory.MobileMessage;
import com.xtremee.gper.factory.PushMessage;

/**
 * SimpleMsgFactory
 *
 * @author Shen Jun
 */
public class SimpleMsgFactory {

    public static IMessage create(String type){
        switch (type){
            case "mail":
                return new MailMessage();
            case "mobile":
                return new MobileMessage();
            case "push":
                return new PushMessage();
            default:return null;
        }
    }

    public static IMessage create(Class<? extends IMessage> clazz){
        if(clazz!=null){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
