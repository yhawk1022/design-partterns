package org.yan.practice.patterns.stuctural.flyweight.tree;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pangyan
 * @date 2020/5/14 13:14
 * @description 工厂
 */
public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType result = treeTypes.get(name);
        if (null == result){
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }


}
