package org.yan.practice.patterns.behavioral.publisher;

import java.io.File;

/**
 * @author pangyan
 * @date 2020/6/8 17:10
 * @description 通用观察者接口
 */
public interface EventListener {

    void update(String eventType, File file);
}
