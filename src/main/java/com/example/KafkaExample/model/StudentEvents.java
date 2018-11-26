package com.example.KafkaExample.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@ToString
public class StudentEvents {

    private String id=UUID.randomUUID().toString();
    private Student student;
    private EventStatus status;

    public StudentEvents(Student student, EventStatus status) {
        this.student = student;
        this.status = status;
    }
}
