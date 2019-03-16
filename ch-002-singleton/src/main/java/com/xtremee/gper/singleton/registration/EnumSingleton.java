package com.xtremee.gper.singleton.registration;

/**
 * EnumSingleton
 *
 * @author Shen Jun
 * @date 2019/3/16
 */
public enum EnumSingleton {

    /**
     * 单实例
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
