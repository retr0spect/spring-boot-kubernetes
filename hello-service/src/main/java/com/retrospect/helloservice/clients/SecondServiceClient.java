package com.retrospect.helloservice.clients;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SecondServiceClient {


    public String getFromSecondService() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8081/", HttpMethod.GET,null, String.class);
        return responseEntity.getBody();

    }
}
