package com.example.myproject.service;


import com.example.myproject.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ImageInterface extends JpaRepository<Image, Integer> {
    @Query("select i from Image i where i.name = :name ORDER BY i.id DESC")
    ArrayList<Image> findByName(String name);
}
