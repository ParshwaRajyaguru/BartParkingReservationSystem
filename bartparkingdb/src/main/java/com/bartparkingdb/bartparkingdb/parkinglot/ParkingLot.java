package com.bartparkingdb.bartparkingdb.parkinglot;


public class ParkingLot {
    private int parkinglotID;
    private String parkinglotName;
    private String createdDate;

    public ParkingLot() {

    }

    public ParkingLot(int parkinglotID, String parkinglotName, String createdDate) {
        this.parkinglotID = parkinglotID;
        this.parkinglotName = parkinglotName;
        this.createdDate = createdDate;
    }

    public int getParkinglotID() {
        return parkinglotID;
    }

    public void setParkinglotID(int parkinglotID) {
        this.parkinglotID = parkinglotID;
    }

    public String getParkinglotName() {
        return parkinglotName;
    }

    public void setParkinglotName(String parkinglotName) {
        this.parkinglotName = parkinglotName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
