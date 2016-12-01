package com.project.chat;

import com.project.beans.Message;
import com.project.beans.XmlSocketBox;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by User on 07.11.2016.
 */
public class MessagesDeque {
    public static ConcurrentLinkedDeque<Message> messagesDeque = new ConcurrentLinkedDeque();

    public static String dequeToXmlString(){
        return XmlSocketBox.instanse.generateStringFromXml(Util.instanse.dequeToDocument(messagesDeque));
    }


}
