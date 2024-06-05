package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.RoleInterface;
import com.example.demo.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    UserInterface u;

    @Autowired
    RoleInterface r;

    @GetMapping("/sign-in")
    public String signIn(){
        return "signIn";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "signUp";
    }

    @GetMapping("/checking")
    public String signUp(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        for(int i = 0 ; i < u.findAll().size() ; i ++){
            User user = u.findAll().get(i);
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("Đăng nhập thành công");
                if(user.getRole().getId() == 1){
                    return "redirect:/admin/home";
                }else if(user.getRole().getId() == 2){
                    return "redirect:/user/home";
                }else {
                    model.addAttribute("error","Account or password is incorrect!");
                    return "signIn";
                }
            }
        }
        model.addAttribute("error","Account or password is incorrect!");
        return "signIn";
    }

}
