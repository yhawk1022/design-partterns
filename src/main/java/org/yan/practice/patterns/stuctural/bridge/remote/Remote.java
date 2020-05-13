package org.yan.practice.patterns.stuctural.bridge.remote;

/**
 * @author pangyan
 * @date 2020/5/12 17:05
 * @description 所有远程控制器的通用接口
 */
public interface Remote {

    void power();

    void volumeUp();

    void volumeDown();

    void channelUp();

    void channelDown();
}
