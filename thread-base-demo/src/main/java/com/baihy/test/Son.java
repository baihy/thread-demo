package com.baihy.test;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.test
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/30 16:41
 */
public class Son extends Parent {

    static {
        System.out.println("Son----------------static");
    }


    public Son() {
        System.out.println("Son------------构造方法");
    }
}
