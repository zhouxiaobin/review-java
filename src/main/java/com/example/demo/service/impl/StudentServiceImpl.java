package com.example.demo.service.impl;


import com.example.demo.mapper.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryStudentList()
    {
        return studentMapper.queryStudentList();
    }
    @Override
    @Transactional
    public void testMyBatisFirstLevelCache() {
        // 模拟 MyBatis 一级缓存
        System.out.println("First Query:");
        List<Student> students1 = studentMapper.queryStudentList();
        System.out.println(students1);

        System.out.println("Second Query:");
        List<Student> students2 = studentMapper.queryStudentList();
        // 比较两次查询结果是否相同（同一个 SqlSession 下，一级缓存生效）
        System.out.println("Is same object: " + (students1 == students2));
    }
}
