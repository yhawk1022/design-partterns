package org.yan.practice.patterns.creational.abstractfactory;

/**
 * @author pangyan
 * @date 2020/6/23 1:50
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Application application = new Application(new HTMLGUIFactory());
    }
}
