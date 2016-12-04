package com.senacor.repository;

import com.senacor.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(@Param("username") String username);
}
