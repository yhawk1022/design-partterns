package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:47
 * @description
 */
public class WindowsGUIFactory implements GUIFactory {


    @Override
    public Button creButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox creCheckBox() {
        return new WindowsCheckBox();
    }
}
