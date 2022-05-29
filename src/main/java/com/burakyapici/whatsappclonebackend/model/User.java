package com.burakyapici.whatsappclonebackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String email;
    private String password;
    private String imageURL;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chatId")
    private List<Chat> chats;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "messageId")
    private List<Message> messages;

}
