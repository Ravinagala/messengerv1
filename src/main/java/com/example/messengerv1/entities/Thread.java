package com.example.messengerv1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="threads")
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "thread_type")
    private String threadtype;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "thread")
    @JsonIgnore
    private List<ThreadMember> threadMembers;

    @OneToMany(mappedBy = "thread")
    @JsonIgnore
    private List<ThreadMessage> threadMessages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThreadtype() {
        return threadtype;
    }

    public void setThreadtype(String threadtype) {
        this.threadtype = threadtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
