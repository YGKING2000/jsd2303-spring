package cn.tedu.spring.dibase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className BookTest
 * @date 2023/05/04 15:55
 */
public class BookTest {
    /* 1.原生setter注入属性 */
    @Test
    public void setTest() {
        Book book = new Book();
        book.setName("琅琊榜");
        book.setAuthor(new Author("胡歌", 28));
        System.out.println(book);
    }
    /* 2.原生构造器constructor注入属性 */
    @Test
    public void constructorTest() {
        Book book = new Book("梦华录", new Author("刘亦菲", 27));
        System.out.println(book);
    }

    /* 3.通过spring的set注入属性 */
    @Test
    public void springSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_di.xml");
        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book);// Book{name='琅琊榜', author='胡歌'}
        System.out.println(book2);// Book{name='琅琊榜', author='胡歌'}
        book.setName("仙剑奇侠传三");
        System.out.println(book);// Book{name='仙剑奇侠传三', author='胡歌'}
        System.out.println(book2);// Book{name='仙剑奇侠传三', author='胡歌'}
        System.out.println(book == book2);// true
    }
    /* 4.通过spring的constructor注入属性 */
    @Test
    public void springConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_di.xml");
        Book book2 = context.getBean("book2", Book.class);
        System.out.println(book2);
    }
}
