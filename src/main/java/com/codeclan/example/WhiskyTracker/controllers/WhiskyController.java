package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/byyear/{year}")
    public List<Whisky> findWhiskiesByYear(@PathVariable int year){
        return whiskyRepository.findWhiskiesByYear(year);
    }

    @GetMapping(value = "bydistandage/{id}/{age}")
    public List<Whisky> findWhiskiesByDistilleryIDAndAge(@PathVariable Long id, @PathVariable int age){
        return whiskyRepository.findWhiskiesByDistilleryIdAndAge(id, age);
    }

//    @GetMapping(value = "/byregion/{region}")
//    public List<Whisky> findWhiskiesByRegion(@PathVariable String Region){
//        return  whiskyRepository.findWhiskiesByRegion(Region);
//    }

    @GetMapping(value = "/byregion/{region}")
    public List<Whisky> findWhiskiesByRegion(@PathVariable String region){
        return  whiskyRepository.findWhiskiesByDistilleryRegion(region);
    }

}
