package org.yan.practice.patterns.stuctural.facade.bitrate;

import org.yan.practice.patterns.stuctural.facade.model.VideoFile;
import org.yan.practice.patterns.stuctural.facade.codec.Codec;

/**
 * @author pangyan
 * @date 2020/5/13 19:24
 * @description 读取器
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }

}
