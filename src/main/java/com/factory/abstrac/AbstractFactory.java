package com.factory.abstrac;

/**
 * 作为一个程序的入口
 */
public abstract class AbstractFactory {
    /**
     * 得到蒙牛牛奶名称
     * @return
     */
    abstract String getMengNiuMikName();

    /**
     * 得到特仑苏牛奶名称
     * @return
     */
    abstract String getTeLunSuMikName();

}
