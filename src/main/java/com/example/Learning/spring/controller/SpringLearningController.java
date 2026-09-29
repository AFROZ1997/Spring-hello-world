package com.example.Learning.spring.controller;

import com.example.Learning.spring.service.SpringLearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SpringLearningController {
@Autowired
    private SpringLearningService springLearningService;
    @GetMapping("/hello")
    public String helloWorld(){
        return springLearningService.helloWorld();
    }
}
