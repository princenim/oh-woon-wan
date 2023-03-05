package com.javalot.ohwoonwan.repositories;

import org.springframework.data.repository.CrudRepository;
import com.javalot.ohwoonwan.domain.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}