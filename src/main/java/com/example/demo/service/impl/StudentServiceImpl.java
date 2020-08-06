package com.example.demo.service.impl;

import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> all() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        log.info("执行新增" + student.getClass().getSimpleName() + "类的对象" + student);
        return studentRepository.save(student);
    }

    @Override
    public Student findByStudentName(String studentName) {
        return studentRepository.findByStudentName(studentName);
    }
}