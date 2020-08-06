package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    StudentService studentService;

    @Autowired
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> all(){
        return studentService.all();
    }

    @PostMapping(value = "/save")
    public Student save(@Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(e -> {
                FieldError fieldError = (FieldError) e;
                log.info(fieldError.getDefaultMessage());
            });
        }
        log.info("student:{}",student);
        Date date = student.getStudentBirthday();
        log.info("studentBirthday:{}", date);
        return studentService.save(student);
    }
}
