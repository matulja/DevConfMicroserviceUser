package com.senacor.repository;

import com.senacor.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Marynasuprun on 07.11.2016.
 */


@RepositoryRestResource(collectionResourceRel = "user", path = "registration")
public interface UserRepository extends MongoRepository<User, String> {
}
