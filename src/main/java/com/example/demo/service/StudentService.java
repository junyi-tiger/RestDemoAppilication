package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查找所有学生
     * @return 所有学生列表
     */
    List<Student> all();

    /**
     * 新增一位学生
     * @param student 学生信息
     * @return 新增的学生信息
     */
    Student save(Student student);

    /**
     * 通过姓名查找学生
     * @param studentName 学生姓名
     * @return 找到的学生信息
     */
    Student findByStudentName(String studentName);
}