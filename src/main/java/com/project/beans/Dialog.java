package com.project.beans;

import com.project.chat.Util;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by User on 09.11.2016.
 */
public class Dialog {
    private User user1;
    private User user2;
    private ConcurrentLinkedDeque<Message> messages;

    public Dialog(User user1, User user2){
        this.user1 = user1;
        this.user2 = user2;
        this.messages = new ConcurrentLinkedDeque();
    }

/*    public String messagesToString(){
        return Util.instanse.dequeToString(messages);
    }*/

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    public ConcurrentLinkedDeque<Message> getMessages() {
        return messages;
    }

    public String dequeToXmlString(){
        return XmlSocketBox.instanse.generateStringFromXml(Util.instanse.dequeToDocument(this.messages));
    }
}
