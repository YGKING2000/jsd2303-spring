package cn.tedu.spring.life;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserTest
 * @date 2023/05/06 10:21
 */
public class UserTest {
    @Test
    public void testLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans_life.xml");
        User user = context.getBean("user", User.class);
        // 使用阶段
        user.run();
        // 销毁阶段
        context.close();
    }
}
