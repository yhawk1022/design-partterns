package org.yan.practice.patterns.stuctural.bridge.remote;

import org.yan.practice.patterns.stuctural.bridge.device.Device;

/**
 * @author pangyan
 * @date 2020/5/12 17:15
 * @description
 */
public class AdvanceRemote extends BaseRemote {

    public AdvanceRemote(Device device){
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        super.device.setVolume(0);
    }
}
