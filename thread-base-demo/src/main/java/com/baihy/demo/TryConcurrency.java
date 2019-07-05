package com.baihy.demo;

import java.util.concurrent.TimeUnit;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.demo
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/04 18:07
 */
public class TryConcurrency {


    public static void browseNews() {
        while (true) {
            System.out.println("**********浏览新闻****************");
            threadSleep();
        }
    }


    public static void lintenerMusic() {
        while (true) {
            System.out.println("**********听音乐****************");
            threadSleep();
        }
    }


    private static void threadSleep() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
