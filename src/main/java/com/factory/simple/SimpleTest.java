package com.factory.simple;

/**
 * 这是一个简单工厂模式
 */
public class SimpleTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println(factory.getMilk("蒙牛"));
    }
}
