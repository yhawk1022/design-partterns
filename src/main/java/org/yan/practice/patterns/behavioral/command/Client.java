package org.yan.practice.patterns.behavioral.command;

/**
 * @author pangyan
 * @date 2020/6/8 16:04
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
