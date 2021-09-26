package com.example.spring_boot_jwt_phamtuandat.repository;

import com.example.spring_boot_jwt_phamtuandat.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
