package com.burakyapici.whatsappclonebackend.repository;

import com.burakyapici.whatsappclonebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User getUserByEmailAndPassword(String userEmail, String userPassword);
}
