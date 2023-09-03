package com.example.messengerv1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="thread_messages")
public class ThreadMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int id;

    @Column(name="from_userid")
    private int senderid;

    @Column(name="thread_id")
    private int threadid;

    @Column(name="content")
    private String content;

    @Column(name="timestamp")
    private LocalDateTime timestamp;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "from_userid", referencedColumnName = "id", updatable = false, insertable = false)
    private User user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "thread_id", referencedColumnName = "id", updatable = false, insertable = false)
    private Thread thread;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public int getThreadid() {
        return threadid;
    }

    public void setThreadid(int threadid) {
        this.threadid = threadid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
