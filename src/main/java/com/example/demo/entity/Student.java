package com.example.demo.entity;


import java.io.Serializable;
import java.util.List;

public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;
    private String sex;
    private int age;

    private List<Course> courses;
    private Address address; // 新增 Address 对象

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters and Setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course>  getCourses() {
        return courses;
    }

    public void setCourses(List<Course>  courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}