package org.yan.practice.patterns.behavioral.publisher;

import java.io.File;
import java.lang.ref.SoftReference;

/**
 * @author pangyan
 * @date 2020/6/8 17:19
 * @description 收到通知后发送邮件
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
