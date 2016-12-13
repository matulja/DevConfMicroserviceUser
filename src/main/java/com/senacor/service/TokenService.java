package com.senacor.service;

import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marynasuprun on 30.11.2016.
 */
@Service
public class TokenService {

    @Autowired
    TokenRepository tokenRepository;

    public Token createToken (User user){
        Token token = new Token (user);
        tokenRepository.save(token);
        return token;
    }

    public String checkToken(String tokenId) {
        Token token = tokenRepository.findByTokenId(tokenId);
        if (token != null) {
            return token.getTokenId();
        }else{
            return "";
        }
    }


    public String getUserId(String tokenId) {
        System.out.println(tokenRepository.findByTokenId(tokenId).getUserId());
        return  tokenRepository.findByTokenId(tokenId).getUserId();
    }
}
