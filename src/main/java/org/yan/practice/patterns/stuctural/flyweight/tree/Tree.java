package org.yan.practice.patterns.stuctural.flyweight.tree;

import java.awt.*;

/**
 * @author pangyan
 * @date 2020/5/14 11:43
 * @description 包含每棵树独特的状态
 */
public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g){
        type.draw(g,x,y);
    }
}
