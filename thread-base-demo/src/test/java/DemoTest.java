/**
 * @projectName: thread-demo
 * @packageName: PACKAGE_NAME
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/04 18:10
 */
public class DemoTest {

    public static void main(String[] args) {
        // 这行代码就会在开辟20m的内存空间
        byte[] b = new byte[10 * 1024 * 1024];

        System.out.println((0x00000000ffb80000-0x00000000ff980000)/1024);

    }

}
