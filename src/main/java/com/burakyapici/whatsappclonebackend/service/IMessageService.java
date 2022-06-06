package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.Message;

import java.util.List;

public interface IMessageService {

    public Result<List<Message>> getChatMessages(Long id);

}
