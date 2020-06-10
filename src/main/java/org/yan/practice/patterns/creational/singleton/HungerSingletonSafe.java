package org.yan.practice.patterns.creational.singleton;

/**
 * @author pangyan
 * @date 2020/6/11 0:22
 * @description
 */
public class HungerSingletonSafe {
    private static HungerSingletonSafe instance;

    private HungerSingletonSafe(){}

    public static HungerSingletonSafe getInstance(){
        synchronized (HungerSingletonSafe.class){
            if (instance==null){
                instance = new HungerSingletonSafe();
            }
            return instance;
        }
    }

//    public synchronized static HungerSingletonSafe getInstance(){
//        if (instance==null){
//            instance = new HungerSingletonSafe();
//        }
//        return instance;
//    }
}
