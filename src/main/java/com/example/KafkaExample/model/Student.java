package com.example.KafkaExample.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
@Builder
@Component
public class Student {
    private String id=UUID.randomUUID().toString(),name,course;
}
