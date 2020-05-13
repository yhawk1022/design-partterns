package org.yan.practice.patterns.stuctural.facade.codec;

import org.yan.practice.patterns.stuctural.facade.model.VideoFile;

/**
 * @author pangyan
 * @date 2020/5/13 19:20
 * @description 编解码器简单工厂
 */
public class CodecFactory {
    public static Codec extract(VideoFile videoFile){
        String type = videoFile.getCodecType();
        if ("mp4".equals(type)){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }else if ("ogg".equals(type)){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new OggCompressionCodec();
        }else {
            return null;
        }
    }

    public static Codec extract(String type){
        if ("mp4".equals(type)){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }else if ("ogg".equals(type)){
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new OggCompressionCodec();
        }else {
            return null;
        }
    }
}
