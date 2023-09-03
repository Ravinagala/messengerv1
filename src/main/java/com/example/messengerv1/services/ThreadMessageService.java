package com.example.messengerv1.services;

import com.example.messengerv1.entities.ThreadMessage;

import java.util.List;

public interface ThreadMessageService {

    List<ThreadMessage> getMessages();

    ThreadMessage getById(int id);

    ThreadMessage addNewMessage(ThreadMessage threadMessage);

    ThreadMessage setContentById(int id, String content);

    void deleteById(int id);
}
