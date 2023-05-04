package cn.tedu.spring.iocxml.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TestStudent
 * @date 2023/05/04 15:32
 */
public class TestStudent {
    @Test
    public void implTest() {
        // 接口有一个唯一的实现类时，IoC容器能根据接口类对象获取bean
        // 接口有多个的实现类时，IoC容器不能根据接口类对象获取bean，会报无唯一Bean定义异常NoUniqueBeanDefinitionException
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean(Student.class);
        student.run();
    }
}
