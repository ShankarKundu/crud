package com.example.KafkaExample.config;

import com.example.KafkaExample.stream.StudentStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(StudentStream.class)
public class StreamConfig {
}
