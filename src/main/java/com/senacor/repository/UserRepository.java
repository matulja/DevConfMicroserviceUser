package com.senacor.repository;

import com.senacor.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@Repository
//@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(@Param("username") String username);
}
