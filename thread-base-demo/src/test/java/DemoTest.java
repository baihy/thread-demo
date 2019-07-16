/**
 * @projectName: thread-demo
 * @packageName: PACKAGE_NAME
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/04 18:10
 */
public class DemoTest {


    public static void main(String[] args) {
        // 获取当前jvm的堆内存的剩余内存大小
        long freeMemory = Runtime.getRuntime().freeMemory();
        // 获取当前jvm的堆内存的总内存大小
        long totalMemory = Runtime.getRuntime().totalMemory();
        // 获取当前jvm的堆内存的最大内存大小
        long maxMemory = Runtime.getRuntime().maxMemory();
        // 创建一个对象，在堆内存中开辟一个块大小为4M的内存空间，存放这个对象
        byte[] b = new byte[4 * 1024 * 1024];
        System.out.println("当前堆内存剩余空间大小：" + freeMemory);
        System.out.println("当前堆内存的总内存大小：" + totalMemory);
        System.out.println("当前堆内存最大内存大小：" + maxMemory);
    }

}