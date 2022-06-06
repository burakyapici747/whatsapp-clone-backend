package com.burakyapici.whatsappclonebackend.controller;


import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.service.MessageServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/message")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MessageController {

    private final MessageServiceImpl messageServiceImpl;

    @GetMapping("/messages/{id}")
    public ResponseEntity<Result> getAllMessages(@PathVariable Long id){
        return ResponseEntity.ok().body(this.messageServiceImpl.getChatMessages(id));
    }

}
