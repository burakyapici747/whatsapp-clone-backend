package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.Chat;
import com.burakyapici.whatsappclonebackend.repository.IChatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ChatServiceImpl implements IChatService{

    private final IChatRepository iChatRepository;

    @Override
    public Result<List<Chat>> getUserChats(Long id) {
        List<Chat> userChats = iChatRepository.getChatsByUserId(id);
        if(Objects.isNull(userChats)){
            return new Result<List<Chat>>(false, null, "Herhangi bir chat bulunmadı!");
        }
        return new Result<List<Chat>>(true, userChats, "Bütün chatler listelendi!");
    }

}
