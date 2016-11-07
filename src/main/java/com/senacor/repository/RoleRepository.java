package com.senacor.repository;

import com.senacor.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

//@RepositoryRestResource(collectionResourceRel = "event", path = "event")
public interface RoleRepository extends MongoRepository<Role, String> {
}

