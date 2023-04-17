package com.example.demo;

import com.example.demo.student.Student;
import org.apache.catalina.Service;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//		ApplicationContext context = new  ClassPathXmlApplicationContext("student.xml");
//
//		context.getBean("service", Service.class).getStudents();


	}






}
