package com.garage.user.management.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/just")
    public String justTest(){
        return "HEE HEE";
    }

}
