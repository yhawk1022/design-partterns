package org.yan.practice.patterns.creational.singleton;

/**
 * @author pangyan
 * @date 2020/6/11 0:15
 * @description 单例-懒汉式
 */
public class LazySingleton {

    private static final LazySingleton INSTANCE = new LazySingleton();

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

    }
}
