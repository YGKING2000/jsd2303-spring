package cn.tedu.homework.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className OrderTest2
 * @date 2023/05/05 09:25
 */
public class OrderTest2 {
    @Test
    public void springSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order2.xml");
        final Order2 order = context.getBean("order", Order2.class);
        System.out.println(order);
    }

    @Test
    public void springConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order2.xml");
        final Order2 order2 = context.getBean("order2", Order2.class);
        System.out.println(order2);
    }

    @Test
    public void springCDATATest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order2.xml");
        final Order2 order3 = context.getBean("order3", Order2.class);
        System.out.println(order3);
    }
}
