package com.bartparkingdb.bartparkingdb.parkingslot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingSlotController {
    @Autowired
    ParkingSlotRepository parkingSlotRepository;

    @RequestMapping("/parkinglot/{parkingLotID}")
    public List<ParkingSlot> findAllParkingSlotsByParkingLot(@PathVariable int parkingLotID) {
        return parkingSlotRepository.findAllParkingLots(parkingLotID);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/parkinglot/{parkingLotID}/{parkingSlotId}")
    public int reserveParkingSlotById(@PathVariable("parkingLotID") int parkingLotID, @PathVariable("parkingSlotId") int parkingSlotID) {
        return parkingSlotRepository.reservedParkingSlotById(parkingLotID, parkingSlotID);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/parkinglot/{parkingLotID}/{parkingSlotId}")
    public int reserveParkingSlot(@RequestBody ParkingSlot parkingSlot) {
        return parkingSlotRepository.reservedParkingSlot(parkingSlot);
    }
}
