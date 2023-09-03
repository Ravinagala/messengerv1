package com.example.messengerv1.services;

import com.example.messengerv1.entities.ThreadMember;

import java.util.List;

public interface ThreadMembersService {

    List<ThreadMember> getThreadMembers();
}
