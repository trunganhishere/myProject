package com.example.demo.service;

import com.example.demo.entity.Image;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ImageInterface extends JpaRepository<Image,Integer> {
    @Query("select i from Image i where i.name = :name")
    ArrayList<Image> findByName(@Param("name") String name);
}
