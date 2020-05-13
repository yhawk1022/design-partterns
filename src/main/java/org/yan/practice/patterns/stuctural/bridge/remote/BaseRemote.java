package org.yan.practice.patterns.stuctural.bridge.remote;

import org.yan.practice.patterns.stuctural.bridge.device.Device;

/**
 * @author pangyan
 * @date 2020/5/12 17:07
 * @description 基础远程控制器
 */
public class BaseRemote implements Remote {

    protected Device device;

    public BaseRemote(){}

    public BaseRemote(Device device){
        this.device= device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnable()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume()+1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setVolume(device.getChannel()+1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setVolume(device.getChannel()-1);
    }
}
