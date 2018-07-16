package com.bartparkingdb.bartparkingdb.parkingslot;

public class ParkingSlot {
    private int parkingSlotID;
    private int parkingSlotNumber;
    private boolean Allocated;
    private int consumerID;
    private int parkingLotID;

    public ParkingSlot() {

    }

    public ParkingSlot(int parkingSlotID, int parkingSlotNumber, boolean allocated, int consumerID, int parkingLotID) {
        this.parkingSlotID = parkingSlotID;
        this.parkingSlotNumber = parkingSlotNumber;
        Allocated = allocated;
        this.consumerID = consumerID;
        this.parkingLotID = parkingLotID;
    }


    public int getParkingSlotID() {
        return parkingSlotID;
    }

    public void setParkingSlotID(int parkingSlotID) {
        this.parkingSlotID = parkingSlotID;
    }

    public int getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(int parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public boolean isAllocated() {
        return Allocated;
    }

    public void setAllocated(boolean allocated) {
        Allocated = allocated;
    }

    public int getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(int consumerID) {
        this.consumerID = consumerID;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }
}
