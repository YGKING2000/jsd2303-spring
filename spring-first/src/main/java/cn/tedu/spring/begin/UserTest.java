package cn.tedu.spring.begin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserTest
 * @date 2023/05/04 10:46
 */
public class UserTest {
    public static void main(String[] args) {
        /* 一、spring创建对象 */
        // 1.加载spring配置文件(beans.xml)，在这一步user对象就已经被创建了
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 2.获取spring创建的对象
        User user = (User) context.getBean("user");
        // 3.调用add()方法
        user.add();

        /* 二、new创建对象 */
        User user1 = new User();
        user1.add();

        /* 三、反射创建对象 */
        try {
            Class<?> cls = Class.forName("cn.tedu.spring.begin.User");
            User user2 = (User) cls.newInstance();
            user2.add();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
