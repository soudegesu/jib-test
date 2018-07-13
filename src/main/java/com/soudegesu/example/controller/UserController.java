package com.soudegesu.example.controller;

import com.soudegesu.example.response.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity user(@RequestParam(name = "name") String name) {

        User user = new User();
        user.setName(name);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
