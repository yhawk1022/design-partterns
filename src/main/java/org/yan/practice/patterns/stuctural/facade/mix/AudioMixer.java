package org.yan.practice.patterns.stuctural.facade.mix;

import org.yan.practice.patterns.stuctural.facade.model.VideoFile;

import java.io.File;

/**
 * @author pangyan
 * @date 2020/5/13 19:26
 * @description 调音
 */
public class AudioMixer {
    public File fix(VideoFile file){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
