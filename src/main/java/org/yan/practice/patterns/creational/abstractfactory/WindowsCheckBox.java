package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:46
 * @description
 */
public class WindowsCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("windows ✔");
    }
}
