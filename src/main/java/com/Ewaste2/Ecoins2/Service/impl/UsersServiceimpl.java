package com.Ewaste2.Ecoins2.Service.impl;

import com.Ewaste2.Ecoins2.Model.Users;
import com.Ewaste2.Ecoins2.Repository.UsersRepository;
import com.Ewaste2.Ecoins2.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceimpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public String login(String userName, String password) {
        Optional<Users> usersOptional = usersRepository.findByUserName(userName);  // Use Optional
        if (usersOptional.isPresent()) {
            Users user = usersOptional.get();
            if (user.getPassword().equals(password)) {
                return "1";
            } else {
                return "Invalid login";
            }
        }
        return "User not found";
    }

    @Override
    public String store(Users user) {
        Optional<Users> existingUser = usersRepository.findByUserName(user.getUserName());
        if (existingUser.isPresent()) {
            return "User already exists";
        } else {
            usersRepository.save(user);
            return "User registered successfully";
        }
    }


}