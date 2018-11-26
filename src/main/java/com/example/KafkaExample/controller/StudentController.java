package com.example.KafkaExample.controller;

import com.example.KafkaExample.model.Student;
import com.example.KafkaExample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentServiceService;

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendStudents(@RequestBody Student student){
        studentServiceService.sendStudentDetails(student);
    }
}
