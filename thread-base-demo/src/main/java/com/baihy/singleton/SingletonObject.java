package com.baihy.singleton;

/**
 * @projectName: thread-demo
 * @packageName: com.baihy
 * @description:
 * @author: huayang.bai
 * @date: 2019/08/02 14:17
 */
public class SingletonObject {

    private static SingletonObject singletonObject = null;

    private SingletonObject() {
        if (singletonObject != null) {
            // 这样做的话，可以避免使用反射机制实例化对象。
            throw new RuntimeException("单例对象已经创建");
        }
    }

    public static SingletonObject newInstance() {
        if (singletonObject == null) {
            // 第一次检查是为了防止进入同步代码块了，是为了提高效率
            synchronized (SingletonObject.class) {
                if (singletonObject == null) {
                    // 第二次检查是为了防止，先进入的线程在实例化对象的时候，已经执行过了第一次检查。
                    // 双重检测锁定代码块的方式实现了单例设计模式,
                    singletonObject = new SingletonObject();
                }
            }
        }
        return singletonObject;
    }


}
