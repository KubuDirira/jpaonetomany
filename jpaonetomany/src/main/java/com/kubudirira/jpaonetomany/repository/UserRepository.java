package com.kubudirira.jpaonetomany.repository;

import com.kubudirira.jpaonetomany.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
