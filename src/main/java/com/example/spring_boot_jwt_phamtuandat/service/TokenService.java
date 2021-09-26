package com.example.spring_boot_jwt_phamtuandat.service;

import com.example.spring_boot_jwt_phamtuandat.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
