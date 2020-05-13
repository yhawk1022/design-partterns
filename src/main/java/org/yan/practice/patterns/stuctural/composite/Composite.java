package org.yan.practice.patterns.stuctural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pangyan
 * @date 2020/5/12 18:59
 * @description
 */
public class Composite implements Component {

    protected List<Component> childrenComponentList = new ArrayList();

    @Override
    public String operation() {
        String prefix = "Branch(";
        String suffix = ")";
        String rs = "";
        for (Component c : childrenComponentList){
            rs += c.operation();
            if (childrenComponentList.indexOf(c)!=childrenComponentList.size()-1){
                rs += "-";
            }
        }

        return prefix + rs + suffix;
    }

    public void add(Component component) {
        childrenComponentList.add(component);
    }

    public void add(Component... components) {
        childrenComponentList.addAll(Arrays.asList(components));
    }

    public void remove(Component component) {
        childrenComponentList.remove(component);
    }

    public void remove(Component... components) {
        childrenComponentList.removeAll(Arrays.asList(components));
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
