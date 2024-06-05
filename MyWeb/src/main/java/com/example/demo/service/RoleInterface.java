package com.example.demo.service;

import com.example.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleInterface extends JpaRepository<Role, Integer> {
}
