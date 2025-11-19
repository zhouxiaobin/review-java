package com.example.demo.service;



import com.example.demo.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> queryStudentList();
    void  testMyBatisFirstLevelCache();
    void  testMyBatisSecondLevelCache();
    List<Student> testDynamicQuery(String username, Integer age);

    List<Student> queryStudentWithAddress();

    List<Student> queryStudentsWithCourses();
}

