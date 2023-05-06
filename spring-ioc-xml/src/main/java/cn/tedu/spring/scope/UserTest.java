package cn.tedu.spring.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserTest
 * @date 2023/05/06 09:33
 */
public class UserTest {
    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_scope.xml");
        final User user = context.getBean("user", User.class);
        final User user2 = context.getBean("user", User.class);
        System.out.println(user == user2);// true
    }

    @Test
    public void testPrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_scope.xml");
        final User user = context.getBean("user2", User.class);
        final User user2 = context.getBean("user2", User.class);
        System.out.println(user == user2);// false
    }
}
