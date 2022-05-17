package com.example.service;

import com.example.response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {

    public MarsRoverApiResponse getRoverData(String marsApiRover, Integer marsSol) {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"
                        + marsApiRover + "/photos?sol=" + marsSol + "&api_key=DEMO_KEY",
                MarsRoverApiResponse.class);

        return response.getBody();
    }
}
