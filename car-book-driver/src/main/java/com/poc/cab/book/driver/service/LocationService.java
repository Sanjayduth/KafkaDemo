package com.poc.cab.book.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public  void  cabLocation(String location){
        System.out.println(location);
    }
}
