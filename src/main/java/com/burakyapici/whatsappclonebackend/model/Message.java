package com.burakyapici.whatsappclonebackend.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private Date messageDate;
    private String messageContent;
    @ManyToOne
    private User user;
    @ManyToOne
    private Chat chat;

}
