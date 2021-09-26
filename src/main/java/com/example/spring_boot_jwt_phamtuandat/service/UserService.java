package com.example.spring_boot_jwt_phamtuandat.service;

import com.example.spring_boot_jwt_phamtuandat.authen.UserPrincipal;
import com.example.spring_boot_jwt_phamtuandat.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
