package com.burakyapici.whatsappclonebackend.controller;


import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;
import com.burakyapici.whatsappclonebackend.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.Objects;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/login")
    public ResponseEntity<Result> login(@RequestBody User user){
        if(Objects.isNull(user)){
            return ResponseEntity.badRequest().body(new Result<>(true, null, "Hatalı parametre!"));
        }
        return ResponseEntity.ok().body(this.userServiceImpl.login(user));
    }

    @PostMapping("/register")
    public ResponseEntity<Result> register(@RequestBody User user){
        if(Objects.isNull(user)){
            return ResponseEntity.badRequest().body(new Result<>(true, null, "Hatalı parametre!"));
        }
        return ResponseEntity.ok().body(this.userServiceImpl.register(user));
    }

}
