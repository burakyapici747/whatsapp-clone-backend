package com.burakyapici.whatsappclonebackend.controller;
import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;
import com.burakyapici.whatsappclonebackend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<Result> login(@RequestBody User user){
        //Kontroller eklenecek
        return ResponseEntity.ok().body(this.userService.login(user));
    }

    @PostMapping(path="/register")
    public ResponseEntity<Result> register(@RequestBody User user){
        //Kontroller eklenecek
        return ResponseEntity.ok().body(this.userService.register(user));
    }

}
