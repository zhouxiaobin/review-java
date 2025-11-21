package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/query-with-address")
    public List<Student> queryStudentWithAddress() {
        return studentService.queryStudentWithAddress();
    }

    @GetMapping("/students-with-courses")
    public List<Student> getStudentsWithCourses() {
        return studentService.queryStudentsWithCourses();
    }

    @GetMapping("/test-reuse-executor")
    public List<Student> testReuseExecutor() {
        return studentService.queryStudentList();
    }

    @PostMapping("/batch-insert")
    public String batchInsertStudents(@RequestBody List<Student> students) {
        studentService.batchInsertStudents(students);
        return "Batch insert completed!";
    }

    @GetMapping("/query-with-vip")
    public List<Student> queryStudentsWithVipType() {
        return studentService.queryStudentList();
    }
}