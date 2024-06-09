package com.example.demo.controller;

import com.example.demo.entity.Image;
import com.example.demo.service.ImageInterface;
import com.example.demo.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ImageController {

    @Autowired
    ImageInterface ii;

    @Autowired
    HomeController hc;

    @Autowired
    UserInterface u;

    @GetMapping("/admin/picture")
    public String adminPictrue(Model model){
        model.addAttribute("myInfomation",u.getReferenceById(1));
        model.addAttribute("infomation",u.getUserSignIn(hc.getUsernameSignIn(),hc.getPasswordSignIn()));
        model.addAttribute("mainImage",ii.findByName("main_image"));
        return "adminPicture";
    }

    @GetMapping("/user/picture")
    public String userPictrue(Model model){
        model.addAttribute("myInfomation",u.getReferenceById(1));
        model.addAttribute("infomation",u.getUserSignIn(hc.getUsernameSignIn(),hc.getPasswordSignIn()));
        model.addAttribute("mainImage",ii.findByName("main_image"));
        return "userPicture";
    }

    @GetMapping("/picture")
    public String pictrue(Model model){
        model.addAttribute("myInfomation",u.getReferenceById(1));
        model.addAttribute("infomation",u.getUserSignIn(hc.getUsernameSignIn(),hc.getPasswordSignIn()));
        model.addAttribute("mainImage",ii.findByName("main_image"));
        return "nonUserPicture";
    }

    @PostMapping("/admin/picture/add")
    public String addPicture(@RequestParam("linkImg") String linkImg , @RequestParam("col") Integer col, Image i){
        i.setImage(linkImg);
        i.setCol(col);
        i.setName("main_image");
        ii.save(i);
        return "redirect:/admin/picture";
    }

    @GetMapping("/admin/picture/form/add")
    public String formAdd(){
        return "formAddImage";
    }
}
