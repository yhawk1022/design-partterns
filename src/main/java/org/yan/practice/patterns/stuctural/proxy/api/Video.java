package org.yan.practice.patterns.stuctural.proxy.api;

import java.util.UUID;

/**
 * @author pangyan
 * @date 2020/5/14 14:27
 * @description 视频文件
 */
public class Video {

    private String id;

    private String title;

    private String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = UUID.randomUUID().toString();
    }

    public Video() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
