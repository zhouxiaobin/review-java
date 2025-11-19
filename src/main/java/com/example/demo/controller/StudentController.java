package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/query")
    public List<Student> queryStudentList() {
        List<Student> students = studentService.queryStudentList();
        return students;
    }

    @GetMapping("/test-cache")
    public void testMyBatisFirstLevelCache() {
        studentService.testMyBatisFirstLevelCache();
    }

    @GetMapping("/test-second-cache")
    public void testMyBatisSecondLevelCache() {
        studentService.testMyBatisSecondLevelCache();
    }

    @GetMapping("/test-dynamic-query")
    public List<Student> testDynamicQuery(String username, Integer age) {
        List<Student> students = studentService.testDynamicQuery(username, age );
        return students;
    }
}