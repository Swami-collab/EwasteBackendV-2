package com.Ewaste2.Ecoins2.Service;

import com.Ewaste2.Ecoins2.Model.Users;

public interface UsersService {
//    Users create(Users users);

    String login(String userName, String password);


    String store(Users users);
}