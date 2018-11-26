
package com.example.KafkaExample.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StudentStream {
    String INPUT="students-in";
    String OUTPUT="students-out";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();


    @Output(OUTPUT)
    MessageChannel outBoundGreetings();
}

