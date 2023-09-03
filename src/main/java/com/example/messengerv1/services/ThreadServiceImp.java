package com.example.messengerv1.services;

import com.example.messengerv1.entities.Thread;
import com.example.messengerv1.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadServiceImp implements ThreadService {

    @Autowired
    ThreadRepo threadRepo;
    @Override
    public List<Thread> getThreads() {
        return threadRepo.findAll();
    }
}
