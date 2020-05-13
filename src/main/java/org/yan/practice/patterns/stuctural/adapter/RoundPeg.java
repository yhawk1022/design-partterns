package org.yan.practice.patterns.stuctural.adapter;

/**
 * @author pangyan
 * @date 2020/5/12 14:42
 * @description 圆钉
 */
public class RoundPeg {

    private double radius;

    public RoundPeg(double radius){
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public double getRadius() {
        return this.radius;
    }
}
