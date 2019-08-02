package com.baihy.singleton;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy
 * @description:
 * @author: huayang.bai
 * @date: 2019/08/02 14:17
 */
public class SingletonTest {



    public static  void main(String[] args){
        SingletonObject singletonObject = SingletonObject.newInstance();
        System.out.println(singletonObject);
    }


}
