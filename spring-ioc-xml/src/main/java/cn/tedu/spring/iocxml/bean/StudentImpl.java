package cn.tedu.spring.iocxml.bean;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className StudentImpl
 * @date 2023/05/04 15:27
 */
public class StudentImpl implements Student {
    @Override
    public void run() {
        System.out.println("StudentImpl running...");
    }
}
