package com.company;

public interface iMessage {
    //define all the public methods
    String getSender();
    String setSender(String value);
    String getReceiver();
    String setReceiver(String value);
    String getSubject();
    String setSubject (String value);
    String getMessage();
    String setMessage(String value);

    String send();

}
