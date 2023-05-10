package cn.tedu.spring.autowired.service;

import org.springframework.stereotype.Service;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserServiceImp1
 * @date 2023/05/06 14:40
 */
@Service
public class UserServiceImp1 implements UserService {
    @Override
    public void run() {
        System.out.println("UserServiceImp1的run()正在执行...");
    }
}
