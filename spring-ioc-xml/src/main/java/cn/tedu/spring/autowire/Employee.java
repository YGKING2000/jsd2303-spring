package cn.tedu.spring.autowire;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Employee
 * @date 2023/05/06 11:29
 */
public class Employee {
    private String name;
    private Dept dept;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
