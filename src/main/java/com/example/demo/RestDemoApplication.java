package com.example.demo;

import com.example.demo.constant.OrderStatus;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Order;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.OrderRepository;
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
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

		return args -> {
			employeeRepository.save(new Employee("李力", "开发人员"));
			employeeRepository.save(new Employee("刘涛", "测试人员"));

			employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

			orderRepository.save(new Order("MacBook Pro", OrderStatus.COMPLETED));
			orderRepository.save(new Order("iPhone 12 Pro", OrderStatus.IN_PROGRESS));

			orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
		};
	}
}
