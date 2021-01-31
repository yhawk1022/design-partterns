package org.yan.practice.patterns.creational;

/**
 * @author pangyan
 * @date 2020/10/8 18:57
 * @description
 */
public class Apple {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "count=" + count +
                '}';
    }
}
