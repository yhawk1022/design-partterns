package org.yan.practice.patterns.stuctural.bridge.device;

/**
 * @author pangyan
 * @date 2020/5/12 17:04
 * @description
 */
public class Tv implements Device {
    private boolean on = false;
    private int volume = MAX_VOLUME >> 1;
    private int channel = MIN_CHANNEL;

    private final static int MIN_VOLUME = 0;
    private final static int MAX_VOLUME = 100;

    private final static int MIN_CHANNEL = 1;
    private final static int MAX_CHANNEL = 50;


    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent < MIN_VOLUME) this.volume = MIN_VOLUME;
        if (percent > MAX_VOLUME) this.volume = MAX_VOLUME;

        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL) this.channel = MIN_CHANNEL;
        if (channel > MAX_CHANNEL) this.channel = MAX_CHANNEL;

        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
