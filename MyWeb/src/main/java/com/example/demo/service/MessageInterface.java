package com.example.demo.service;

import com.example.demo.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageInterface extends JpaRepository<Message, Integer> {
}
