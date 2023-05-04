package cn.tedu.spring.iocxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserTest
 * @date 2023/05/04 14:32
 */
public class UserTest {
    // @Test: 测试注解，可以让一个方法不借助与main()方法也能调用
    // 测试bean对象的创建

    @Test
    public void idTest() {
        // 1.根据id属性值获取bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.run();
    }

    @Test
    public void classTest() {
        // 2.根据类对象获取bean对象
        // 当beans.xml里有多个相同类的bean对象，这种方式获取bean对象会报无唯一Bean定义异常NoUniqueBeanDefinitionException
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean(User.class);
        user.run();
        user.run();
    }

    @Test
    public void idClassTest() {
        // 3.根据id属性值以及类对象获取bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        user.run();
        user.run();
        user.run();
    }
}
