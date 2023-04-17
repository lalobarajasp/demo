package com.example.demo.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentService studentService;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

   @GetMapping
    public List<Student> getStudents(){
        LOGGER.debug("its for debugging purpose"); //it's going to log all the messages which have debug(info/warn/error)
        LOGGER.info("Logging services started"); //ignore debug but it's going to log info
        LOGGER.warn("please check carefully");
        LOGGER.error("Something is wrong!");


        return studentService.getStudents();
    }

}
