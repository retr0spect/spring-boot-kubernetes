package com.retrospect.orderapplication.services;

import com.retrospect.orderapplication.clients.SecondServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheService {


    @Autowired
    SecondServiceClient secondServiceClient;

    public String getFromSecondService() {

        return secondServiceClient.getFromSecondService();

    }

}
