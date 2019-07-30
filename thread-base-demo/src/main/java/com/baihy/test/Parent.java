package com.baihy.test;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.test
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/30 16:41
 */
public class Parent {

    static {
        System.out.println("parent----------------static");
    }


    public Parent() {
        System.out.println("parent------------构造方法");
    }
}
