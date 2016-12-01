package com.project.chat;

import com.project.beans.User;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by User on 06.11.2016.
 */
public class OnlineUsersMap {
    public static Map<String, User> onlineUserMap = new ConcurrentHashMap();

    public static String getOnlineUserLoginsThroughTheSpaceLastSpaceIncluding(){
        StringBuilder result = new StringBuilder();
        Set<String> logins = onlineUserMap.keySet();
        for (String i : logins){
                result.append(i);
                result.append(" ");
        }
        return result.toString();
    }

}
