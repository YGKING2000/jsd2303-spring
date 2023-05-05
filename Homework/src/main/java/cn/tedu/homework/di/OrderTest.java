package cn.tedu.homework.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className OrderTest
 * @date 2023/05/04 19:25
 */
public class OrderTest {
    @Test
    public void springSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order.xml");
        final Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void springConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order.xml");
        final Order order2 = context.getBean("order2", Order.class);
        System.out.println(order2);
    }

    @Test
    public void springCDATATest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-order.xml");
        final Order order3 = context.getBean("order3", Order.class);
        System.out.println(order3);
    }
}
