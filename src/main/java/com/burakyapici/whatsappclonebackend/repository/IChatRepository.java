package com.burakyapici.whatsappclonebackend.repository;

import com.burakyapici.whatsappclonebackend.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IChatRepository extends JpaRepository<Chat, Long> {

    List<Chat> getChatsByUserId(Long id);
}
