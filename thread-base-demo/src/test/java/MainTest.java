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

    /**
     * fast-fail机制：
     *  在调用iterator()方法是会实例化Itr对象，在这个对象的成员属性中，有int expectedModCount = modCount;
     *  这样在初始化的时候，就确定了修改的次数，如果在迭代的过程中，修改了集合，那么就会导致expectedModCount != modCount
     *  这就导致了异常的出现。
     */
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
            if ("aaa".equals(str)) {
                list.remove(str); // 注意这里Iterator的remove，而不是list的remove方法
                // it.remove();
        /**
         * 区别是：ArrayList类中的方法，修改的过程中，没有这一行代码：expectedModCount = modCount;
         * 设置他们两个相等。所以，在遍历的过程中，调用list的remove方法操作集合，就会触发fast-fail机制，
         * 而在Iterator实现类的java.util.ArrayList.Itr中，remove方法中，有expectedModCount = modCount;这行代码。
         * 所以在remove操作之后，expectedModCount和modCount仍然是相等的。所以，就不会触发fast-fail机制。
         */
            }
        }
        System.out.println(list);
    }

}
