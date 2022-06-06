package com.burakyapici.whatsappclonebackend.controller;


import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.service.ChatServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/chat")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChatController {

    private final ChatServiceImpl chatServiceImpl;

    @GetMapping("/chats/{id}")
    public ResponseEntity<Result> getAllChats(@PathVariable Long id){
        return ResponseEntity.ok().body(this.chatServiceImpl.getUserChats(id));
    }

}
