package org.yan.practice.patterns.stuctural.proxy;

import org.yan.practice.patterns.stuctural.proxy.api.NativeYoutubeLibServiceImpl;
import org.yan.practice.patterns.stuctural.proxy.download.YoutubeDownloader;
import sun.misc.Cleaner;

/**
 * @author pangyan
 * @date 2020/5/14 15:23
 * @description
 */
public class Client {


    public static void main(String[] args) {
        System.out.println("standard mode start");
        YoutubeDownloader youtubeDownloader = new YoutubeDownloader(new NativeYoutubeLibServiceImpl());
        test(youtubeDownloader);


        System.out.println("proxy mode start");
        youtubeDownloader = new YoutubeDownloader();
        test(youtubeDownloader);

    }


    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervideos");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
