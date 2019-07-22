package com.baihy.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.demo
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/22 9:11
 */
public class Test {
    private  volatile int a = 0;
    private  volatile int b = 0;
    private volatile Integer x;
    private volatile Integer y;


    public static void main(String[] args) {
        new Test().test();
    }

    public void test() {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread1 = new Thread(() -> {
            a = 1;
            x = b;
            System.out.println("11111111111111");
            countDownLatch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            b = 1;
            y = a;
            System.out.println("22222222222");
            countDownLatch.countDown();
        });
        thread1.start();
        thread2.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }


}
