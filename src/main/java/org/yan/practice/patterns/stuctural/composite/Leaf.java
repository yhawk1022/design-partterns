package org.yan.practice.patterns.stuctural.composite;

/**
 * @author pangyan
 * @date 2020/5/12 18:58
 * @description 叶子
 */
public class Leaf implements  Component {
    @Override
    public String operation() {
        return "Leaf";
    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
