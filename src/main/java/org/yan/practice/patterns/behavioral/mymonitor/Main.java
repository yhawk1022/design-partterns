package org.yan.practice.patterns.behavioral.mymonitor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author pangyan
 * @date 2021/1/31 21:46
 * @description
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        EventManager eventManager = new EventManager();

        eventManager.addListener("count", count-> System.out.println("数到5了"));

        eventManager.addListener("say", str-> System.out.println(str));

        Process process = new Process(eventManager);
        Executor executor = Executors.newScheduledThreadPool(10);
        executor.execute(()->{
            try {
                process.count();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.execute(()->{
            process.sayHello();
        });
    }
}
