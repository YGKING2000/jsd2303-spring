package cn.tedu.spring.diobj;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Employee
 * @date 2023/05/05 10:10
 */
public class Employee {
    private Dept dept;
    private String name;
    private Double salary;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
