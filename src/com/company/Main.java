package com.company;

public class Main {

    public static void main(String[] args) {
        String msg = "Coldfilm forever";//ur message
        SendMsg mail = new SendMsg();
        mail.setServer("smtp.gmail.com");
        mail.setProperties();
        mail.Message("receiver@gmail.com", "fsociety", msg, "sender@gmail.com", "1357924680");//FOR EXAMPLE!
    }
}
