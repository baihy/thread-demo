package com.baihy.thread.demo;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.thread.demo
 * @description:
 * @author: huayang.bai
 * @date: 2019/08/02 17:58
 */
public class ThreadPoolsDemo {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("***********************");
        };
        ExecutorService executorService = newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.execute(runnable);
        }
    }


}
