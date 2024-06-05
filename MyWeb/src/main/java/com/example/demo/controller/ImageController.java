package com.example.demo.controller;

import com.example.demo.service.ImageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {

    @Autowired
    ImageInterface ii;

//    @GetMapping("/home")
//    public String home(Model model){
//        model.addAttribute("homeImage",ii.findAll());
//        return "adminHome";
//    }

//    @PostMapping("/admin/image/add")
//    public String addImage(){
//
//    }

}
