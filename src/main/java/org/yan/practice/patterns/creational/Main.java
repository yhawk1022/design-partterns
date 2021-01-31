package org.yan.practice.patterns.creational;

/**
 * @author pangyan
 * @date 2020/10/8 18:58
 * @description
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;

        Apple apple = new Apple();
        apple.setCount(++i);
        System.out.println(apple);
    }
}
