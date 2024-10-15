package org.example;

import org.example.models.Developer;

import java.util.ArrayList;

public class TextChat implements Chat{
    private Developer developer;
    private ArrayList<User> juniors=new ArrayList<>();

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void addJuniorToChat(User u){
        juniors.add(u);
    }


    @Override
    public void send(String message, User user) {
        for (User u:juniors) {
            if (u!=user){
                u.getMessage(message);
            }
        }
        if (user!=developer) developer.getMessage(message);
    }
}
