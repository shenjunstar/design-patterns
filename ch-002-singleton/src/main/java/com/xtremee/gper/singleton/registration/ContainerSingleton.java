package com.xtremee.gper.singleton.registration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ContainerSingleton
 *
 * @author Shen Jun
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> container = new ConcurrentHashMap<>();

    public static Object getBean(String classname) throws Exception {
        synchronized (container){
            if(!container.containsKey(classname)){
                Class<?> clazz = Class.forName(classname);
                Object o = clazz.newInstance();
                container.put(classname,o);
                return o;
            } else {
                return container.get(classname);
            }
        }
    }

}
