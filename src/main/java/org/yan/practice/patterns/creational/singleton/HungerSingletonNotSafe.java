package org.yan.practice.patterns.creational.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author pangyan
 * @date 2020/6/11 0:19
 * @description 饿汉式
 */
public class HungerSingletonNotSafe {
    private static HungerSingletonNotSafe instance;

    private HungerSingletonNotSafe(){}

    public static HungerSingletonNotSafe getInstance(){
        if (instance==null){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new HungerSingletonNotSafe();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(()-> System.out.println(HungerSingletonNotSafe.getInstance().hashCode())).start();
        }
    }
}
