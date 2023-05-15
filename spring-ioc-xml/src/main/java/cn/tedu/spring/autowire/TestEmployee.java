package cn.tedu.spring.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TestEmployee
 * @date 2023/05/06 11:37
 */
public class TestEmployee {
    @Test
    public void autowireTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowire.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);// Employee{name='胡歌', dept=Dept{name='技术部'}}
    }
}
