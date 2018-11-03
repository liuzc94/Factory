package com.factory.func;

/**
 * 相对于简单工厂模式，更加规范化，符合开闭原则
 * 加产品只要加产品线就好
 * 把处理逻辑交给客户端
 */
public class FuncTest {
    public static void main(String[] args) {
        Factory factory = new TelunSuFactory();
         System.out.println(factory.getMilk());
    }
}
