package com.xtremee.gper.singleton.hungry;

/**
 * HungrySingleton
 *
 * @author Shen Jun
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
