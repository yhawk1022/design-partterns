package org.yan.practice.patterns.stuctural.adapter;

/**
 * @author pangyan
 * @date 2020/5/12 14:39
 * @description 圆孔
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return this.radius >= roundPeg.getRadius();
    }
}
