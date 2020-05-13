package org.yan.practice.patterns.stuctural.facade;

import org.yan.practice.patterns.stuctural.facade.bitrate.BitrateReader;
import org.yan.practice.patterns.stuctural.facade.codec.Codec;
import org.yan.practice.patterns.stuctural.facade.codec.CodecFactory;
import org.yan.practice.patterns.stuctural.facade.mix.AudioMixer;
import org.yan.practice.patterns.stuctural.facade.model.VideoFile;

import java.io.File;

/**
 * @author pangyan
 * @date 2020/5/13 19:28
 * @description 视频转换外观类
 *
 * 一个视频转换格式分为：
 * 读取文件格式
 * 获取源格式编解码器及目标格式编码器
 * 读取视频文件转为通用的数据结构
 * 转换为目标格式的视频文件并创建
 *
 * 应用通过门面模式调用各个模块，直接产生用户需要的结果
 */
public class VideoConversionFacade {

    public File convertVideo(String fileName, String destinationFormat){
        System.out.println("VideoConversionFacade: conversion started.");

        //创建音频文件对象
        VideoFile file = new VideoFile(fileName);

        //获取source对应的编解码器
        Codec sourceCodec = CodecFactory.extract(file);

        //获取destination对应的编码器
        Codec destinationCodec = CodecFactory.extract(destinationFormat);

        //通过二进制读取器获取视频文件
        VideoFile sourceBuffer = BitrateReader.read(file, sourceCodec);

        //通过二进制读取器转换格式
        VideoFile intermediateResult = BitrateReader.convert(sourceBuffer, destinationCodec);

        //创建目标视频文件
        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
