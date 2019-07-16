/**
 * @projectName: thread-demo
 * @packageName: PACKAGE_NAME
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/04 18:10
 */
public class DemoTest1 {


    public static void main(String[] args) {
        // 第一次配置：直接指定新生代的大小
        // -Xmx20m -Xms20m -Xmn10m  -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
        // 第二次配置：不直接指定新生代的大小，而是指定新生代和老年代的比例
        // -Xmx20m -Xms20m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
        byte[] b = new byte[1 * 1024 * 1024];

    }

}