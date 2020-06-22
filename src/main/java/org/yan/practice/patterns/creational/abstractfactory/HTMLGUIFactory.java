package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:49
 * @description
 */
public class HTMLGUIFactory implements GUIFactory{
    @Override
    public Button creButton() {
        return new HtmlButton();
    }

    @Override
    public CheckBox creCheckBox() {
        return new HtmlCheckBox();
    }
}
