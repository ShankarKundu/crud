package com.example.KafkaExample.service;

import com.example.KafkaExample.model.EventStatus;
import com.example.KafkaExample.model.Student;
import com.example.KafkaExample.model.StudentEvents;
import com.example.KafkaExample.stream.StudentStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class StudentService {


    private final StudentStream studentStream;

    private StudentEvents studentEvents;

    public StudentService(StudentStream studentStream) {
        this.studentStream = studentStream;
    }

    public void sendStudentDetails(Student student) {
        log.info("Sending students{}", student);
        MessageChannel messageChannel = studentStream.outBoundGreetings();
        studentEvents = new StudentEvents(student, EventStatus.CREATE);
        messageChannel.send(MessageBuilder
                .withPayload(studentEvents)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());

    }


}
