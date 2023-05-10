package cn.tedu.spring.resource.controller;

import cn.tedu.spring.resource.service.ResourceService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className UserController
 * @date 2023/05/06 16:31
 */
@Controller
public class ResourceController {
    @Resource(name = "aaa")
    private ResourceService resourceService;

    public void start() {
        System.out.println("ResourceController的start()方法正在执行...");
        resourceService.run();
    }
}
