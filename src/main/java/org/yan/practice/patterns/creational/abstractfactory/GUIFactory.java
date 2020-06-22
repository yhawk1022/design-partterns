package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:47
 * @description
 */
public interface GUIFactory {

    Button creButton();
    CheckBox creCheckBox();
}
