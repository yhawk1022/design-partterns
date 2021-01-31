package org.yan.practice.patterns.behavioral.mymonitor;

import java.util.concurrent.TimeUnit;

/**
 * @author pangyan
 * @date 2021/1/31 21:13
 * @description
 */
public class Process {

    private int count;

    private String sentence;


    private Monitor monitor;

    public Process(Monitor monitor) {
        count = 0;
        sentence = "hello world";
        this.monitor = monitor;

    }

    public void count() throws InterruptedException {
        System.out.println("计数器开始!!");
        for (int i = 0; i < 10; i++) {
            System.out.println("计数："+count);

            if (monitor != null){
                if (i == 5){
                    monitor.count(i);
                }
            }

            TimeUnit.MILLISECONDS.sleep(200);
            count++;
        }
    }

    public void sayHello(){
        System.out.println("说话开始!!");
        if (monitor != null) monitor.say(sentence);
    }

}
