package org.yan.practice.patterns.stuctural.facade.model;

/**
 * @author pangyan
 * @date 2020/5/13 19:15
 * @description 视频文件
 */
public class VideoFile {

    private String name;

    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".")+1);
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}