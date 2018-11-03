package com.factory.abstrac;

import com.factory.func.MengNiuFactory;

/**
 * 抽象工厂模式
 * 相对于工厂模式 ，把客户端的处理逻辑 移动到 Absteractory 实现，
 * 要增加接口，只要更新API就可以，而客户端不用做任何改动，增加了代码的健壮性
 */
public class AbstractTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Factory();
        System.out.println(abstractFactory.getMengNiuMikName());
    }
}
