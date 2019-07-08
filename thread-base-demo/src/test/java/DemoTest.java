/**
 * @projectName: thread-demo
 * @packageName: PACKAGE_NAME
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/04 18:10
 */
public class DemoTest {

    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        String groupName = threadGroup.getName();
        System.out.println(groupName);
    }

}
