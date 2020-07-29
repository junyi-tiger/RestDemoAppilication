package com.example.demo;

import com.example.demo.entity.Clazz;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	public CommandLineRunner createTable(StudentService studentService) {
		return e -> {
			Student student = new Student();
			student.setStudentName("张三");
			student.setStudentBirthday(new Date());
			Clazz clazz = new Clazz();
			clazz.setClazzName("高一（1）班");
			student.setStudentClazz(clazz);
			studentService.addStudent(student);
		};
	}
}
