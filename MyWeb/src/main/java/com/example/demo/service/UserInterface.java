package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.username = :username and u.password = :password")
    User getUserSignIn(String username, String password);
}
