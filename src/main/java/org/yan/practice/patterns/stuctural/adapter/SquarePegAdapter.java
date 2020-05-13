package org.yan.practice.patterns.stuctural.adapter;

/**
 * @author pangyan
 * @date 2020/5/12 14:48
 * @description 方钉到圆孔的适配器
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public SquarePeg getPeg() {
        return peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(peg.getWidth()/2, 2)*2);
    }
}
