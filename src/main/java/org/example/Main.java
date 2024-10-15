package org.example;

import org.example.models.Developer;
import org.example.models.Junior;

public class Main {
    public static void main(String[] args) {
        TextChat tc=new TextChat();

        Developer dev=new Developer("Dev",tc);
        Junior jun=new Junior("jun1",tc);
        Junior jun1=new Junior("jun2",tc);

        tc.addJuniorToChat(jun);
        tc.addJuniorToChat(jun1);

        tc.setDeveloper(dev);

        jun1.sendMessage("Hello juns");
    }
}