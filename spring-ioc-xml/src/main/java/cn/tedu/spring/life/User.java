package cn.tedu.spring.life;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className User
 * @date 2023/05/06 10:15
 */
public class User {
    private String username;

    public User() {
        System.out.println("1.创建bean对象");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("2.给bean对象注入属性");
    }

    public void init() {
        System.out.println("3.初始化bean对象");
    }

    public void run() {
        System.out.println("4.使用阶段调用run()方法");
    }

    public void destroy() {
        System.out.println("5.销毁bean对象");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
