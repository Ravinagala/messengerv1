package com.example.messengerv1.services;

import com.example.messengerv1.entities.User;
import com.example.messengerv1.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepo userRepo;


    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
