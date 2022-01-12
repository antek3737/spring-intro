package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    String expectedMessage = "Antoni Zub";

    @Override
    public String getMessage() {
        return expectedMessage;
    }
}
