package com.burakyapici.whatsappclonebackend.service;

import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;
import com.burakyapici.whatsappclonebackend.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{

    private final IUserRepository iUserRepository;

    @Override
    public Result<User> login(User user) {
        User userLogin = this.iUserRepository.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
        if(Objects.isNull(userLogin)){
            return new Result<User>(false, null, "Kullanıcı adı veya şifre hatalı!");
        }
        return new Result<User>(false, this.iUserRepository.getUserByEmailAndPassword(user.getEmail(), user.getPassword()), "Giriş başarılı!");
    }

    @Override
    public Result<User> register(User user){
        return new Result<User>(false, iUserRepository.save(user), "Kayıt başarili");
    }


}
