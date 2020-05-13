package org.yan.practice.patterns.stuctural.composite;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pangyan
 * @date 2020/5/12 19:20
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Operator operator = new Operator();

        Composite composite = new Composite();
        composite.add(new Leaf(),new Leaf(),new Leaf());


        operator.print(new Leaf());
        operator.print(new Composite());
        operator.print(new Composite(),new Leaf());
        operator.print(composite);

        List<Component> components = new ArrayList<>();
        components.addAll(Arrays.asList(new Leaf(),new Leaf(),composite));
        for (Component component : components){
            operator.print(component);
        }
    }

    static class Operator{
        public void print(Component... components){
            for (Component c : components){
                System.out.println(c.operation());
            }
        }

        public void print(Component component1,Component component2){
            if (component1.isComposite()){
                Composite composite = (Composite) component1;
                composite.add(component2);
            }
            System.out.println(component1.operation());
        }
    }
}
