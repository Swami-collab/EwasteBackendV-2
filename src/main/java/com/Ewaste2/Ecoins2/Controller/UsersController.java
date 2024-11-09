package com.Ewaste2.Ecoins2.Controller;


import com.Ewaste2.Ecoins2.Model.Users;
import com.Ewaste2.Ecoins2.Repository.UsersRepository;
import com.Ewaste2.Ecoins2.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersservice;
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/{userName}")
    Optional<Users> getUser(@PathVariable  String userName)
    {
        return usersRepository.findByUserName(userName);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Users users){
        String usersfoundmessage =usersservice.store(users);
        return ResponseEntity.ok(usersfoundmessage);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users loginRequest) {
        try {
            String responseMessage = usersservice.login(loginRequest.getUserName(), loginRequest.getPassword());
            return ResponseEntity.ok(responseMessage);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error occurred during login: " + e.getMessage());
        }
    }

}