package com.retrospect.orderapplication.clients;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SecondServiceClient {


    public String getFromSecondService() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(System.getenv("SECOND_SERVICE_URI"), HttpMethod.GET,null, String.class);
        return responseEntity.getBody();

    }
}
