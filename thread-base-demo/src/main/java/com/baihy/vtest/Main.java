package com.baihy.vtest;

import java.util.concurrent.CountDownLatch;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.vtest
 * @description:
 * @author: huayang.bai
 * @date: 2019/08/02 14:33
 */
public class Main {

    //  private volatile Integer count = 0;
    // 原子性操作
    private Integer count = 0;

    private int num = 10000;

    public static void main(String[] args) {
        new Main().test();
    }


    public void test() {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            for (int i = 0; i < num; i++) {
                count++;  // ++ 操作不是原子性操作。
            }
            countDownLatch.countDown();
        }).start();
        new Thread(() -> {
            for (int i = 0; i < num; i++) {
                count--; // -- 操作不是原子性操作。
            }
            countDownLatch.countDown();
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count最终的值是：" + count);
    }

}
