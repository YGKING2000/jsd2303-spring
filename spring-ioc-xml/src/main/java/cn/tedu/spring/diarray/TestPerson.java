package cn.tedu.spring.diarray;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TestPerson
 * @date 2023/05/05 11:30
 */
public class TestPerson {
    @Test
    public void demo01Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_diarray.xml");
        final Person person = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(Arrays.toString(person.getHobbies()));
    }
}
