package cn.tedu.spring.autowire;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Person
 * @date 2023/05/06 11:39
 */
public class Person {
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
