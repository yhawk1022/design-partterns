package org.yan.practice.patterns.stuctural.adapter;

/**
 * @author pangyan
 * @date 2020/5/12 14:45
 * @description 方钉
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(this.width, 2);
    }

}
