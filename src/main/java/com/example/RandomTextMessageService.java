package com.example;

import org.springframework.stereotype.Component;

import java.util.*;
@Component("messageService2")
public class RandomTextMessageService implements MessageService {

    ArrayList<String> messages = new ArrayList<>(List.of("Wiadomość 1",
            "Wiadomość 2",
            "Wiadomość 3",
            "Wiadomość 4",
            "Wiadomość 5",
            "Wiadomość 6",
            "Wiadomość 7",
            "Wiadomość 8",
            "Wiadomość 9",
            "Wiadomość 10"));

    @Override
    public String getMessage() {
        return messages.get(new Random().nextInt(10));
    }

}
