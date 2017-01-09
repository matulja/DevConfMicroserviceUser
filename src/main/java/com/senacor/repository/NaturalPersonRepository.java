package com.senacor.repository;

import com.senacor.model.NaturalPerson;
import com.senacor.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@Repository
public interface NaturalPersonRepository extends MongoRepository<NaturalPerson, String> {

    NaturalPerson findByUserId(String userId);
}
