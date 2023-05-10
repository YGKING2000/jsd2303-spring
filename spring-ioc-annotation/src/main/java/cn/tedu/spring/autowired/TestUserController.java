package cn.tedu.spring.autowired;

import cn.tedu.spring.autowired.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TestUserController
 * @date 2023/05/06 14:49
 */
public class TestUserController {
    @Test
    public void autowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-autowired.xml");
        UserController controller = context.getBean("userController", UserController.class);
        controller.start();
    }
}
