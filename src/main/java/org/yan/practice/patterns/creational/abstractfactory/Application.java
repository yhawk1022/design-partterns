package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:56
 * @description
 */
public class Application {

    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.creButton();
        checkbox = factory.creCheckBox();
    }

    public void paint() {
        button.onClick();
        checkbox.check();
    }
}
