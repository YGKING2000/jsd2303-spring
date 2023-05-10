package cn.tedu.spring.resource.service;

import org.springframework.stereotype.Service;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className ResourceServiceImp1
 * @date 2023/05/06 16:33
 */
@Service("aaa")
public class ResourceServiceImp1 implements ResourceService {
    @Override
    public void run() {
        System.out.println("ResourceServiceImp1的run()方法正在执行...");
    }
}
