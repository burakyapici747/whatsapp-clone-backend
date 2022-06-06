package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;


public interface IUserService {

    public Result<User> login(User user);
    public Result<User> register(User user);

}
