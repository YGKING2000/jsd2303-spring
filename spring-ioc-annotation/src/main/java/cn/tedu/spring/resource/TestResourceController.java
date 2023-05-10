package cn.tedu.spring.resource;

import cn.tedu.spring.config.SpringConfig;
import cn.tedu.spring.resource.controller.ResourceController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TestResourceController
 * @date 2023/05/06 16:37
 */
public class TestResourceController {
    // 1.使用XML配置文件开启组件扫描
    @Test
    public void resourceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-resource.xml");
        ResourceController controller = context.getBean("resourceController", ResourceController.class);
        controller.start();
    }

    // 2.使用配置类开启组件扫描
    @Test
    public void configTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceController controller = context.getBean("resourceController", ResourceController.class);
        controller.start();
    }
}
