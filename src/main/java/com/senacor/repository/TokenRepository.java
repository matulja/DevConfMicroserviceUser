package com.senacor.repository;

import com.senacor.model.Token;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marynasuprun on 30.11.2016.
 */

@Repository
public interface TokenRepository extends MongoRepository<Token, String> {

   Token findByTokenId(String tokenId);
}

