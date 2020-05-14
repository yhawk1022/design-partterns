package org.yan.practice.patterns.stuctural.proxy.api;

import java.util.Map;

/**
 * @author pangyan
 * @date 2020/5/14 14:26
 * @description 远程服务接口
 */
public interface NativeYoutubeLibService {

    /**
     * 获取流行视频
     * @return
     * @throws InterruptedException
     */
    Map<String, Video> popularVideos() throws InterruptedException;

    /**
     * 获取特定的视频
     * @param videoId
     * @return
     */
    Video getVideo(String videoId) throws InterruptedException;
}
