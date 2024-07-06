package com.example.myproject.controller;


import com.example.myproject.entity.User;
import com.example.myproject.service.ImageInterface;
import com.example.myproject.service.RoleInterface;
import com.example.myproject.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserInterface u;

    @Autowired
    RoleInterface r;

    @Autowired
    ImageInterface ii;

    @Autowired
    HomeController hc;

    @GetMapping("/home")
    public String nonUserHome(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("homeImage", ii.findByName("home_image"));
        return "index";
    }

    @GetMapping("/admin/home")
    public String adminHome(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("homeImage", ii.findByName("home_image"));
        return "adminHome";
    }

    @GetMapping("/user/home")
    public String userHome(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("homeImage", ii.findByName("home_image"));
        return "userHome";
    }

    @PostMapping("user/add")
    public String addUser(User user, Model model) {
        for (int i = 0; i < u.findAll().size(); i++) {
            if (user.getUsername().equals(u.findAll().get(i).getUsername())) {
                model.addAttribute("error", "Username invalid");
                return "signUp";
            }
        }
        user.setNgayTao(new Date());
        user.setRole(r.getReferenceById(2));
        u.save(user);
        System.out.println("Success");
        return "redirect:/sign-in";
    }
}
