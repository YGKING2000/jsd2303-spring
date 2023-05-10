package cn.tedu.spring.autowired.controller;

import cn.tedu.spring.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className User
 * @date 2023/05/06 14:39
 */
@Controller
public class UserController {
    @Autowired// 1.属性注入
    // 当一个接口有多个实现类时，@Autowired是通ByType定位类的
    // 需要搭配@Qualifier指定实现类的别名
    @Qualifier("userServiceImp2")
    private UserService userService;

    // @Autowired// 2.set注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    // @Autowired// 3.构造器注入
    /*public UserController(@Autowired*//* 4.形参注入 *//* UserService userService) {
        this.userService = userService;
    }*/

    public void start() {
        System.out.println("UserController的start()方法正在执行...");
        userService.run();
    }
}
