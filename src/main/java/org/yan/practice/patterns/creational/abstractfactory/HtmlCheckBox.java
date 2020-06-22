package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:45
 * @description
 */
public class HtmlCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("[✔]");
    }
}
