package com.bartparkingdb.bartparkingdb.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ConsumerController {
    @Autowired
    ConsumerRepository consumerrepository;

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public int addNewUser(@RequestBody Consumer consumer) {
        return consumerrepository.insert(consumer);
    }


    @RequestMapping("/registration")
    public List<Consumer> addNewUser() {
        return consumerrepository.findAllConsumers();
    }

}
