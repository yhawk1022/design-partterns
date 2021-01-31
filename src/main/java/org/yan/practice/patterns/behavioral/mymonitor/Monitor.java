package org.yan.practice.patterns.behavioral.mymonitor;

/**
 * @author pangyan
 * @date 2021/1/31 21:19
 * @description 监听器接口
 */
public interface Monitor {
    void count(int count);

    void say(String sentence);
}
