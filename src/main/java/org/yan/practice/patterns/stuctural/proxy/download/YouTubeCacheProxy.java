package org.yan.practice.patterns.stuctural.proxy.download;

import org.yan.practice.patterns.stuctural.proxy.api.Video;
import org.yan.practice.patterns.stuctural.proxy.api.NativeYoutubeLibService;
import org.yan.practice.patterns.stuctural.proxy.api.NativeYoutubeLibServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pangyan
 * @date 2020/5/14 14:56
 * @description 带缓存的Youtube下载服务代理类
 */
public class YouTubeCacheProxy implements NativeYoutubeLibService {

    private NativeYoutubeLibService nativeYoutubeLibService;
    private Map<String, Video> popularCache = new HashMap();
    private Map<String, Video> commonCache = new HashMap();

    public YouTubeCacheProxy(){
        this.nativeYoutubeLibService = new NativeYoutubeLibServiceImpl();
    }

    /**
     * 获取流行视频
     *
     * @return
     * @throws InterruptedException
     */
    @Override
    public Map<String, Video> popularVideos() throws InterruptedException {
        if (popularCache.isEmpty()){
            popularCache = nativeYoutubeLibService.popularVideos();
        }else {
            System.out.println("Retrieved list from cache");
        }
        return popularCache;
    }

    /**
     * 获取特定的视频
     *
     * @param videoId
     * @return
     */
    @Override
    public Video getVideo(String videoId) throws InterruptedException {
        Video video = commonCache.get(videoId);
        if (video==null){
            commonCache.put(videoId,this.nativeYoutubeLibService.getVideo(videoId));
        }else {
            System.out.println("Retrieved videoId="+videoId+",from cache");
        }
        return commonCache.get(videoId);
    }

    public void resetCache() {
        popularCache.clear();
        commonCache.clear();
    }
}
