package com.example.HelloApi_Task1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/api")
public class Controller {

    @GetMapping
    public ResponseEntity<String> hello()
    {
        return new ResponseEntity<>("Hello , this is our 1st task", HttpStatus.OK);
    }
}
