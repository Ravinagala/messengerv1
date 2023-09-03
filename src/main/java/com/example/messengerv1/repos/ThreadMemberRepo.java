package com.example.messengerv1.repos;

import com.example.messengerv1.entities.ThreadMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadMemberRepo extends JpaRepository<ThreadMember,Integer> {
}
