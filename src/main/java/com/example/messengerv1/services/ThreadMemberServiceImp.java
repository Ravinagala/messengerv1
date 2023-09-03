package com.example.messengerv1.services;

import com.example.messengerv1.entities.Thread;
import com.example.messengerv1.entities.ThreadMember;
import com.example.messengerv1.repos.ThreadMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadMemberServiceImp implements ThreadMembersService{

    @Autowired
    ThreadMemberRepo threadMemberRepo;

    @Override
    public List<ThreadMember> getThreadMembers() {
        return threadMemberRepo.findAll();
    }
}
