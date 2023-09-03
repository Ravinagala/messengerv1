package com.example.messengerv1.repos;

import com.example.messengerv1.entities.ThreadMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadMessageRepo extends JpaRepository<ThreadMessage,Integer> {
}
