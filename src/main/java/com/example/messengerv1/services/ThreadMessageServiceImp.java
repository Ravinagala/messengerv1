package com.example.messengerv1.services;

import com.example.messengerv1.entities.ThreadMessage;
import com.example.messengerv1.repos.ThreadMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ThreadMessageServiceImp implements ThreadMessageService{

    @Autowired
    ThreadMessageRepo threadMessageRepo;
    @Override
    public List<ThreadMessage> getMessages() {
        return threadMessageRepo.findAll();
    }

    @Override
    public ThreadMessage getById(int id) {
        var v = threadMessageRepo.findById(id);
        if(v.isPresent()){
            return v.get();
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data");
    }

    @Override
    public ThreadMessage addNewMessage(ThreadMessage threadMessage) {
        return threadMessageRepo.save(threadMessage);
    }

    @Override
    public ThreadMessage setContentById(int id, String content) {
        var wm = threadMessageRepo.findById(id);
        if(wm.isPresent()){
            var t = wm.get();
            t.setContent(content);
            threadMessageRepo.save(t);
            return t;
        }else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data Not Found");
    }

    @Override
    public void deleteById(int id) {
        var v = threadMessageRepo.findById(id);
        if(v.isPresent()){
            threadMessageRepo.deleteById(id);
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid Data");;
    }
}
