package com.example.web;

import com.example.dto.HomeDTO;
import com.example.response.MarsRoverApiResponse;
import com.example.service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    private final MarsRoverApiService roverService;

    @Autowired
    public HomeController(MarsRoverApiService roverService) {
        this.roverService = roverService;
    }



    @GetMapping("/")
    public String getHomeView(ModelMap model, HomeDTO homeDTO) {
        //if request param is empty, then set a default value
        if(homeDTO.getMarsApiRoverData().isBlank()){
            homeDTO.setMarsApiRoverData("opportunity");
        }
        if(homeDTO.getMarsSol() == null){
            homeDTO.setMarsSol(1);
        }

        MarsRoverApiResponse roverData = roverService.getRoverData(homeDTO.getMarsApiRoverData(), homeDTO.getMarsSol());
        model.put("rover", roverData);
        model.put("homeDTO",homeDTO);
        System.out.println();

        return "index";
    }

}



