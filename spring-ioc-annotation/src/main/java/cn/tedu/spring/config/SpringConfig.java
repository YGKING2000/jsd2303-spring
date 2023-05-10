package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className SpringConfig
 * @date 2023/05/06 17:22
 */
@Configuration// 将当前类设置为配置类
@ComponentScan("cn.tedu.spring")// 开启组件扫描指定包及其子包下的所有组件类
public class SpringConfig {
}
