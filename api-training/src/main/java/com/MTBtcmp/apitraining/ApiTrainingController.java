package com.MTBtcmp.apitraining;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiTrainingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ditto")
    public String getDitto() {
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        return restTemplate.getForObject(url, String.class);
    }

}
