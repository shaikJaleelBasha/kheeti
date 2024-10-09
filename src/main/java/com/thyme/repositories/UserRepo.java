package com.thyme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thyme.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
