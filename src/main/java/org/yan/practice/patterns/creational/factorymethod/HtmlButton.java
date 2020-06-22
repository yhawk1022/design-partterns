package org.yan.practice.patterns.creational.factorymethod;

/**
 * @author pangyan
 * @date 2020/6/23 0:34
 * @description html按钮
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
