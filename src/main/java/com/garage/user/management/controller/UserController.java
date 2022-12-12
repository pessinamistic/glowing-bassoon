package com.garage.user.management.controller;

import com.garage.user.management.Service.UserService;
import com.garage.user.management.dao.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired UserService UserService;

    @GetMapping("/just")
    public String justTest(){
        return "HEE HEE";
    }

    @PostMapping("/signup")
    public void signup(@RequestBody User user){
        log.info("New User SignUp : {}", user);
    }

}
