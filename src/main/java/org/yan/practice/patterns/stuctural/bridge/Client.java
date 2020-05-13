package org.yan.practice.patterns.stuctural.bridge;

import org.yan.practice.patterns.stuctural.bridge.device.Device;
import org.yan.practice.patterns.stuctural.bridge.device.Radio;
import org.yan.practice.patterns.stuctural.bridge.device.Tv;
import org.yan.practice.patterns.stuctural.bridge.remote.AdvanceRemote;
import org.yan.practice.patterns.stuctural.bridge.remote.BaseRemote;

/**
 * @author pangyan
 * @date 2020/5/12 17:16
 * @description
 */
public class Client {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Test with base remote");
        BaseRemote baseRemote = new BaseRemote(device);
        baseRemote.power();
        device.printStatus();

        System.out.println("Test with advance remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        device.printStatus();
    }
}
