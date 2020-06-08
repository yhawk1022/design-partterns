package org.yan.practice.patterns.behavioral.publisher;

import java.io.File;

/**
 * @author pangyan
 * @date 2020/6/8 17:21
 * @description 收到通知后在日志中记录一条消息
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
