package com.retrospect.helloservice.services;

import com.retrospect.helloservice.clients.SecondServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheService {


    @Autowired
    SecondServiceClient secondServiceClient;

    String getFromSecondService() {

        return secondServiceClient.getFromSecondService();

    }

}
