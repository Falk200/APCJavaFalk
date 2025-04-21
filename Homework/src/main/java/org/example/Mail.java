package org.example;

import java.util.Date;

public class Mail {
    private String sender;
    private String subject;
    private Date dateTime;
    private String message;
    private boolean opened;

    public void markAsRead(){
        opened = true;
    }

    @Override
    public String toString(){
        return subject+" from "+sender+" on "+dateTime.toString()+": "+message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOpened() {
        return opened;
    }

    public Mail(String sender, String subject, Date dateTime, String message, boolean opened) {
        this.sender = sender;
        this.subject = subject;
        this.dateTime = dateTime;
        this.message = message;
        this.opened = opened;
    }
}
