package org.yan.practice.patterns.behavioral.publisher;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author pangyan
 * @date 2020/6/8 17:29
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        try {
            editor.openFile("test.txt");
//            Observable observable;
//            Observer observer;
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
