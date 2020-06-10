package org.yan.practice.patterns.creational.singleton;

/**
 * @author pangyan
 * @date 2020/6/11 0:39
 * @description 相对于饿汉式安全减少了锁的范围
 */
public class DCK {
    private static volatile DCK instance;

    private DCK(){}

    public static DCK getInstance(){
        //业务逻辑
        if (instance==null){
            synchronized (DCK.class){
                if (instance==null){
                    //new DCK()的时候，成员变量instance已经有一个初始值了。超高并发的时候可能会返回一个变量instance刚被初始化的DCK对象
                    instance = new DCK();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(DCK.instance.hashCode()));
        }
    }

}
