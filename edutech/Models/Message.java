package com.flexisaf.edutech.edutech.Models;

import com.flexisaf.edutech.Abstracts.Notification;
import com.flexisaf.edutech.edutech.Interfaces.Notifiable;

public class Message extends Notification implements Notifiable {

    public Message(String message, String recipient) {
        super(message, recipient);
    }

    public void send() {
        System.out.println("Sending message to " + recipient + ": " + message);
    }

    public void sendNotification() {
        send();
    }

    public void receiveNotification() {
        System.out.println("Notification received: " + message);
    }

    public void dismissNotification() {
        System.out.println("Notification dismissed.");
    }
}