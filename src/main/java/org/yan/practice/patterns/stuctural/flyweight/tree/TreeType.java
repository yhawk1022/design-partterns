package org.yan.practice.patterns.stuctural.flyweight.tree;

import java.awt.*;

/**
 * @author pangyan
 * @date 2020/5/14 11:45
 * @description 包含多棵树共享的状态
 */
public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y){
        g.setColor(Color.BLACK);
        g.fillRect(x-1,y,3,5);
        g.setColor(color);
        g.fillOval(x-5,y-10,10,10);
    }

}

