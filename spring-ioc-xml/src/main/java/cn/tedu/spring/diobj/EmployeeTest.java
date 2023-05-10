package cn.tedu.spring.diobj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className EmployeeTest
 * @date 2023/05/05 10:30
 */
public class EmployeeTest {
    @Test
    // 外部bean测试
    public void beanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_diobj.xml");
        final Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    // 内部bean测试
    public void beanTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_diobj.xml");
        final Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println(employee2);// Employee{dept=Dept{name='技术管理部'}, name='刘亦菲', salary=19999.99}
    }
}
