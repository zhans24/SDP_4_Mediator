package org.example.models;

import org.example.Chat;
import org.example.TextChat;
import org.example.User;

public class Developer implements User {
    private String name;
    private Chat chat;

    public Developer(String name,Chat chat) {
        this.name = name;
        this.chat=chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.send(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name+" "+message);
    }



}
