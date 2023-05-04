package cn.tedu.spring.exercise;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className ProductTest
 * @date 2023/05/04 17:05
 */
public class ProductTest {
    @Test
    public void springSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_product.xml");
        Product product = context.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void springConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_product.xml");
        final Product product = context.getBean("product2", Product.class);
        System.out.println(product);
    }

    @Test
    public void springCDATATest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_product.xml");
        final Product product = context.getBean("product3", Product.class);
        System.out.println(product);
    }
}
