package com.poc.cabbookuser.service;

import com.poc.cabbookuser.constant.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send(AppConstants.CAB_LOCATION,location);
    }
}
