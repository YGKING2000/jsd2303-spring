package cn.tedu.spring.dilistmap;

import java.util.List;
import java.util.Map;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Student
 * @date 2023/05/05 11:51
 */
public class Student {
    private String name;
    private Integer age;
    private Map<String, String> teacherMap;
    private List<String> courseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, String> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, String> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherMap=" + teacherMap +
                ", courseList=" + courseList +
                '}';
    }
}
