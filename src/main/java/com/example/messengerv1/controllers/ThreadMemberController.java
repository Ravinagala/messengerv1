package com.example.messengerv1.controllers;

import com.example.messengerv1.entities.ThreadMember;
import com.example.messengerv1.services.ThreadMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThreadMemberController {
    @Autowired
    ThreadMembersService threadMembersService;

    @GetMapping("/getThreadMembers")
    public List<ThreadMember> threadMembers(){
        return threadMembersService.getThreadMembers();
    }

}
