package com.burakyapici.whatsappclonebackend.service;
import com.burakyapici.whatsappclonebackend.Results.Result;
import com.burakyapici.whatsappclonebackend.model.User;
import com.burakyapici.whatsappclonebackend.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //Kontrol edilmesi gereken özellikler eklenecek

    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public Result<User> login(User user){
        User userControl = this.iUserRepository.getUserByNameAndPassword(user.getName(), user.getPassword());
        if(userControl == null){
            return new Result<>(true, null, "Username or password is wrong!");
        }

        return new Result<>(false, userControl, "Login is successful!");
    }

    public Result<User> register(User user){
        return new Result<User>(false, this.iUserRepository.save(user), "User created");
    }

}
