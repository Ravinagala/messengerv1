package com.example.messengerv1.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<ThreadMember> threadMembers;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<ThreadMessage> threadMessages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ThreadMember> getThreadMembers() {
        return threadMembers;
    }

    public void setThreadMembers(List<ThreadMember> threadMembers) {
        this.threadMembers = threadMembers;
    }

    public List<ThreadMessage> getThreadMessages() {
        return threadMessages;
    }

    public void setThreadMessages(List<ThreadMessage> threadMessages) {
        this.threadMessages = threadMessages;
    }
}

