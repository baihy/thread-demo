package com.baihy.main;

import com.baihy.service.MyInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy.main
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/31 9:24
 */
public class ServiceMain {

    public static void main(String[] args) {
        ServiceLoader<MyInterface> serviceLoader = ServiceLoader.load(MyInterface.class);

        for (Iterator<MyInterface> it = serviceLoader.iterator(); it.hasNext(); ) {
            MyInterface myInterface = it.next();
            System.out.println(myInterface);
        }
    }
}
