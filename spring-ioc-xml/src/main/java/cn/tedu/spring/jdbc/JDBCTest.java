package cn.tedu.spring.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className JDBCTest
 * @date 2023/05/05 16:54
 */
public class JDBCTest {
    @Test
    public void demo01() {
        try {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true&allowMultiQueries=true");
            dataSource.setUsername("root");
            dataSource.setPassword("123456");
            dataSource.setInitialSize(5);
            final DruidPooledConnection connection = dataSource.getConnection();
            final Statement statement = connection.createStatement();
            String sql = "SELECT * FROM teacher";
            final ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
                System.out.println(name + " " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo02() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans_jdbc.xml");
            final DruidDataSource dataSource = context.getBean("druidDataSource", DruidDataSource.class);
            final DruidPooledConnection connection = dataSource.getConnection();
            final Statement statement = connection.createStatement();
            String sql = "SELECT * FROM teacher";
            final ResultSet resultSet = statement.executeQuery(sql);
            int count = 0;
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int salary = resultSet.getInt("salary");
                int age = resultSet.getInt("age");
                if (name.length() > 2) {
                    System.out.println(++count + "\t" + name + "\t" + age + "\t" + gender + "\t" + salary);
                } else {
                    System.out.println(++count + "\t" + name + "\t\t" + age + "\t" + gender + "\t" + salary);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
