package com.senacor.service;

import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Marynasuprun on 30.11.2016.
 */
@Service
public class TokenService {

    @Autowired
    TokenRepository tokenRepository;

    public Token createToken(User user) {
        Token token = new Token(user);
        tokenRepository.save(token);
        System.out.println(token.getTokenId());
        return token;
    }

    public String checkToken(String tokenId) {
        Token token = tokenRepository.findByTokenId(tokenId);
        if (token == null) {
            return "";
        } else if (token.getExpiryTime().isBefore(LocalTime.now())&&token.getExpiryDate().isBefore(LocalDate.now())) {
            tokenRepository.delete(token);
            return "";
        } else {
            return token.getTokenId();
        }
    }


    public String getUserId(String tokenId) {
        System.out.println(tokenRepository.findByTokenId(tokenId).getUserId());
        return tokenRepository.findByTokenId(tokenId).getUserId();
    }

    public void deleteToken(Token token) {
        tokenRepository.delete(token);
    }
}
