package com.example.jason.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("hello jason", HttpStatus.ACCEPTED);
    }
}
