package com.baihy.demo;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/05 15:15
 */
public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            TryConcurrency.browseNews();
        }).start();
        // start方法会调用底层的start0方法，start0方法会调用run方法。start0是本地方法。
        TryConcurrency.lintenerMusic();
    }

}
