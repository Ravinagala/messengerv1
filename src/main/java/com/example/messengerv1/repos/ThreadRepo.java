package com.example.messengerv1.repos;

import com.example.messengerv1.entities.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepo extends JpaRepository<Thread,Integer> {
}
