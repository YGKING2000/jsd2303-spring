package cn.tedu.spring.dilistmap;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className TeacherTest
 * @date 2023/05/05 11:52
 */
public class TeacherTest {

    // List集合set注入属性
    @Test
    public void listSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_dilist.xml");
        final Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }

    // Map集合set注入属性
    @Test
    public void mapSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_dimap.xml");
        final Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    // 利用util标签引用外部集合set注入属性
    @Test
    public void utilSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_diutil.xml");
        final Student student = context.getBean("student", Student.class);
        System.out.println(student);//
    }

    // 利用命名空间p属性set注入属性
    @Test
    public void utilPSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_diutil.xml");
        final Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);
    }
}
