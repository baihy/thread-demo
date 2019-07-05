package com.baihy.demo1;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.demo1
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/05 16:22
 */
public class DemoMain {


    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        // 以下四个线程共享一个资源
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
    }

}
