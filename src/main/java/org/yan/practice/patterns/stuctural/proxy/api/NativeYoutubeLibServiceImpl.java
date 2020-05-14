package org.yan.practice.patterns.stuctural.proxy.api;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pangyan
 * @date 2020/5/14 14:30
 * @description 远程服务接口实现类
 */
public class NativeYoutubeLibServiceImpl implements NativeYoutubeLibService {

    /**
     * 获取流行视频
     * @return
     * @throws InterruptedException
     */
    @Override
    public Map<String, Video> popularVideos() throws InterruptedException {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    /**
     * 获取特定的视频
     * @param videoId
     * @return
     */
    @Override
    public Video getVideo(String videoId) throws InterruptedException {
        connectToServer("http://www.youtube.com");

        return getSomeVideo(videoId);
    }

    private void connectToServer(String serverAddress) throws InterruptedException {
        System.out.println("connect to "+serverAddress+"...");
        mockNetworkLatency();
        System.out.println("already connected");
    }

    private void mockNetworkLatency() throws InterruptedException {
        for (int i=0; i<random(5, 10);i++){
            Thread.sleep(100);
        }
    }

    private int random(int min, int max){
        return min + (int)(Math.random() *((max - min) + 1));
    }

    private HashMap<String, Video> getRandomVideos() throws InterruptedException {
        System.out.print("Downloading populars... ");

        mockNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) throws InterruptedException {
        System.out.print("Downloading video... ");

        mockNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}
