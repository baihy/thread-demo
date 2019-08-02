/**
 * @projectName: thread-demo
 * @packageName: PACKAGE_NAME
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/24 16:06
 */
public class Test1 {

    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println("**********************");

        Thread thread = new Thread(runnable);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start(); // 线程不能重复开启，那么为什线程池中的线程，可以重复启动呢？
    }

}
