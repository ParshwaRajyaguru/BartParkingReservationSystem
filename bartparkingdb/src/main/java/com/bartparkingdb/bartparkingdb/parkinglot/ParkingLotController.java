package com.bartparkingdb.bartparkingdb.parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotController {
    @Autowired
    ParkingLotRepository parkingLotRepository;

    @RequestMapping("/parkinglot")
    public List<ParkingLot> getAllParkingLot(){
        return parkingLotRepository.findAllParkingLots();
    }
}
