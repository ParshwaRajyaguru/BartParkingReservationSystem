package com.bartparkingdb.bartparkingdb.consumer;

public class Consumer {
    private int consumerID;
    private String consumerName;
    private String emailAddress;
    private String password;

    public Consumer() {

    }

    public Consumer(int consumerID, String consumerName, String emailAddress, String password) {
        this.consumerID = consumerID;
        this.consumerName = consumerName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public int getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(int consumerID) {
        this.consumerID = consumerID;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
