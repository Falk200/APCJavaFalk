package org.example;

import java.util.ArrayList;

public class Inbox {
    private ArrayList<Mail> emails = new ArrayList<>();

    public void printHeaders(){
        for (Mail mail : emails){
            System.out.println(mail.isOpened()+"|"+mail.getSubject()+"|"+mail.getSender()+"|"+mail.getDateTime());
        }
    }

    public void open(int index) {
        if (index >= emails.size()) {
            System.out.println("This index does not exist");
        } else {
            System.out.println(emails.get(index));
        }
    }

    public int countUnread(){
        int count = 0;
        for (Mail mail : emails){
            if(!mail.isOpened()){
                count++;
            }
        }
        return count;
    }

    public void addMail(Mail mail){
        emails.add(mail);
    }
}
