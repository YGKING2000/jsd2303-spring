package cn.tedu.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className User
 * @date 2023/05/06 14:04
 */
@Component(value = "user")
// 上述注解相当于在XML文件中：
// <bean id="user" class="cn.tedu.spring.bean.User"/>
// value属性缺省时默认为类名首字母小写
// @Repository
// @Controller
// @Service
public class User {

}
