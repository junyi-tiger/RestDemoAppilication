package com.example.demo;

import com.example.demo.entity.Clazz;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

/**
 * @author lenovo
 */
@SpringBootApplication
@Slf4j
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	CommandLineRunner initStudentTable(StudentRepository studentRepository) {
		return args -> {
			Student student = new Student();
			student.setStudentName("张三");
			student.setStudentBirthday(new Date());
			Clazz clazz = new Clazz();
			clazz.setClazzName("高一（1）班");
			student.setStudentClazz(clazz);
			log.info("Preloading " + studentRepository.save(student));
		};
	}

	@Bean
	CommandLineRunner initEmployeeTable(EmployeeRepository employeeRepository) {
		return args -> log.info("Preloading " + employeeRepository.save(new Employee("李力", "开发人员")));
	}
}
