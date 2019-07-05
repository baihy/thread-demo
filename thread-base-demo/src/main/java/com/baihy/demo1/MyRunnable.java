package com.baihy.demo1;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.demo1
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/05 16:19
 */
public class MyRunnable implements Runnable {


    private static final int MAX = 10000; // 当MAX足够大的时候，就会出现线程安全的问题。

    private int index = 0;

    @Override
    public void run() {
        while (index < MAX) {
            System.out.println(Thread.currentThread().getName() + "*******" + (++index));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
