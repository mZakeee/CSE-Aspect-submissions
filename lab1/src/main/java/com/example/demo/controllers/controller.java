package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @GetMapping("/try")
    public String addNumbers(@RequestParam(value = "a") int a,
                             @RequestParam(value = "b") int b) {
        int sum = a + b;
        return "The sum of " + a + " and " + b + " is " + sum;
    }

    @DeleteMapping("/try")
    public String sayDelete(@RequestParam(value = "a") int a) {
        return "Deletion of" + a +  " is successful ";
    }

    @PostMapping("/try")
    public String sayPost() {
        return "Post request received";
    }

    @PutMapping("/try")
    public String sayPut(@RequestParam(value = "a") int a) {
        return a + " update request received";
    }




}
