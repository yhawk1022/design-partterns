package org.yan.practice.patterns.stuctural.proxy.download;

import org.yan.practice.patterns.stuctural.proxy.api.Video;
import org.yan.practice.patterns.stuctural.proxy.api.NativeYoutubeLibService;

import java.util.Map;

/**
 * @author pangyan
 * @date 2020/5/14 15:12
 * @description youtube下载器
 */
public class YoutubeDownloader {
    private NativeYoutubeLibService api;

    public YoutubeDownloader(){
        this.api = new YouTubeCacheProxy();
    }
    public YoutubeDownloader(NativeYoutubeLibService api){
        this.api = api;
    }

    public void renderVideoPage(String videoId)  {
        try {
            Video video = api.getVideo(videoId);
            System.out.println("\n-------------------------------");
            System.out.println("Video page (imagine fancy HTML)");
            System.out.println("ID: " + video.getId());
            System.out.println("Title: " + video.getTitle());
            System.out.println("Video: " + video.getData());
            System.out.println("-------------------------------\n");
        }catch (Exception e){
            System.out.println("get video Exception");
            e.printStackTrace();
        }

    }

    public void renderPopularVideos()  {
        try {
            Map<String, Video> list = api.popularVideos();
            System.out.println("\n-------------------------------");
            System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
            for (Video video : list.values()) {
                System.out.println("ID: " + video.getTitle() + " / Title: " + video.getTitle());
            }
            System.out.println("-------------------------------\n");
        }catch (Exception e){
            System.out.println("get popular videos Exception");
            e.printStackTrace();
        }

    }
}
