package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.Chat;

import java.util.List;

public interface IChatService {
    public Result<List<Chat>> getUserChats(Long id);
}
