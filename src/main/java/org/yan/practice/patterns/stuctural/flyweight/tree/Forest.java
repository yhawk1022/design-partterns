package org.yan.practice.patterns.stuctural.flyweight.tree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pangyan
 * @date 2020/5/14 13:22
 * @description 绘制的森林
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y, String name, Color color, String otherTreeData){
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x,y,type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics){
        for (Tree tree : trees){
            tree.draw(graphics);
        }
    }
}
