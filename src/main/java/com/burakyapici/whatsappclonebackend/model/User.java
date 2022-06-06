package com.burakyapici.whatsappclonebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "chats"})
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_imageURL")
    private String imageURL;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Chat> chats;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Message> messages;

}
