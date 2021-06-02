package com.example.springbootcourse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SecondController {

    @PostMapping("/second")
    public SampleData getRequest(@RequestBody SampleData data) {
        var random = new Random();
        data.getInfo().setId(random.nextInt(1000));
        return data;
    }
}
