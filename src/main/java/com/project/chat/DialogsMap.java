package com.project.chat;

import com.project.beans.Dialog;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by User on 09.11.2016.
 */
public class DialogsMap {
    public static Map<String, Dialog> dialogsUserMap = new ConcurrentHashMap();
}
