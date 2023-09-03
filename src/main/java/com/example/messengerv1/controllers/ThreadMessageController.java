package com.example.messengerv1.controllers;

import com.example.messengerv1.entities.ThreadMessage;
import com.example.messengerv1.services.ThreadMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThreadMessageController {
    @Autowired
    ThreadMessageService threadMessageService;

    @GetMapping("/getThreadMessages")
    public List<ThreadMessage> getThreadMessages(){
        return threadMessageService.getMessages();
    }

    @GetMapping("/getById")
    public ThreadMessage getById(@RequestParam("id") int id){
        return threadMessageService.getById(id);
    }

    @PostMapping("/addNewMessage")
    public ThreadMessage addNewMessage(@RequestBody ThreadMessage threadMessage){
        return threadMessageService.addNewMessage(threadMessage);
    }

    @PutMapping("/updateContentById")
    public ThreadMessage updateContent(@RequestParam("id") int id, @RequestParam("content") String content ){
        return threadMessageService.setContentById(id, content);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        threadMessageService.deleteById(id);
    }

}
