package com.burakyapici.whatsappclonebackend.controller;


import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;
import com.burakyapici.whatsappclonebackend.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/login")
    public ResponseEntity<Result> login(@RequestBody User user){
        return ResponseEntity.ok().body(this.userServiceImpl.login(user));
    }

}
