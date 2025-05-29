package com.scm.helpers;

public class Message {

    private String content;
    private MessageType type = MessageType.blue; // default to blue

    // No-arg constructor
    public Message() {
    }

    // All-arg constructor
    public Message(String content, MessageType type) {
        this.content = content;
        this.type = type;
    }

    // Getters
    public String getContent() {
        return content;
    }

    public MessageType getType() {
        return type;
    }

    // Setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    // toString (optional)
    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
