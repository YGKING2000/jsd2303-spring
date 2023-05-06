package cn.tedu.spring.dilistmap;

import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Teacher
 * @date 2023/05/05 11:51
 */
public class Teacher {
    private String name;
    // 教师的学生List集合
    private List<Student> studentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
