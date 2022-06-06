package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.Message;
import com.burakyapici.whatsappclonebackend.repository.IMessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements IMessageService{

    private final IMessageRepository iMessageRepository;

    @Override
    public Result<List<Message>> getChatMessages(Long id) {
        return new Result<List<Message>>(false, this.iMessageRepository.findAllMessageByChatId(id), "Mesajlar listelendi");
    }
}
