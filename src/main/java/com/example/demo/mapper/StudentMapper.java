package com.example.demo.mapper;


import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper
{
    //查询所有student方法
    List<Student> queryStudentList();
    List<Student> queryStudentsByDynamicParams(String username, Integer age);

    List<Student> queryStudentWithAddress();

    List<Student> queryStudentsWithCourses();
}