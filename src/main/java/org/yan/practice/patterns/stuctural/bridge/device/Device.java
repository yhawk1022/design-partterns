package org.yan.practice.patterns.stuctural.bridge.device;

/**
 * @author pangyan
 * @date 2020/5/12 16:27
 * @description 设备接口
 */
public interface Device {

    boolean isEnable();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
