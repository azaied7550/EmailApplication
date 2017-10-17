package com.company;

public class Main {

    public static void main(String[] args) {
	Message email = new Message();
	email.setSender("Bart@fox.com");
	email.setReceiver("homer@fox.com");
	email.setSubject ("DOn't have a cow, man!");
	email.setMessage("Hello");

	String result = email.send();
	System.out.println(result);

    }
}
