package com.burakyapici.whatsappclonebackend.repository;

import com.burakyapici.whatsappclonebackend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMessageRepository extends JpaRepository<Message, Long> {

    @Query(
        value = "select user.user_id, message.message_id, chat.chat_id, message.user_user_id ,message.chat_chat_id, user.user_email, message.message_content, message.message_date " +
                "from message " +
                "join user " +
                "on message.user_user_id = user.user_id  " +
                "join chat " +
                "on message.chat_chat_id = chat.chat_id " +
                "where message.chat_chat_id = :chat_id"
            ,
            nativeQuery = true
    )
    List<Message> findAllMessageByChatId(@Param("chat_id") Long id);

}
