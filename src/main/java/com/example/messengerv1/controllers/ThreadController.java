package com.example.messengerv1.controllers;

import com.example.messengerv1.entities.Thread;
import com.example.messengerv1.services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThreadController {
    @Autowired
    ThreadService threadService;

    @GetMapping("/getThreads")
    public List<Thread> getThreads(){
        return threadService.getThreads();
    }
}
