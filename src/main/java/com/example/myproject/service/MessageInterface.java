package com.example.myproject.service;

import com.example.myproject.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageInterface extends JpaRepository<Message, Integer> {
}
