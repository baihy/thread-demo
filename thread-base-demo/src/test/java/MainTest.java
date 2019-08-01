import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @projectName: activiti-root
 * @packageName: com.baihy.demo
 * @description:
 * @author: huayang.bai
 * @date: 2019/07/31 15:07
 */
public class MainTest {

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)) {
                it.remove(); // 注意这里Iterator的remove，而不是list的remove方法
            }
        }
        System.out.println(list);
    }

}
