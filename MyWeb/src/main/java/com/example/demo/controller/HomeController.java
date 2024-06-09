package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.ImageInterface;
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

    @Autowired
    ImageInterface ii;

    @GetMapping("/sign-in")
    public String signIn(){
        return "signIn";
    }

    @GetMapping("/")
    public String start(){
        return "redirect:/home";
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
                usernameSignIn = username;
                passwordSignIn = password;
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

    @GetMapping("/infomation")
    public String infomation(){
        return "nonUserInfomation";
    }

    @GetMapping("/admin/infomation")
    public String adminInfomation(){
        return "adminInfomation";
    }

    @GetMapping("/user/infomation")
    public String userInfomation(){
        return "userInfomation";
    }

    @GetMapping("/contact")
    public String contact(){
        return "nonUserContact";
    }

    @GetMapping("/admin/contact")
    public String adminContact(){
        return "userContact";
    }

    @GetMapping("/user/contact")
    public String userContact(){
        return "adminContact";
    }

    public static String usernameSignIn;
    public static String passwordSignIn;

    public HomeController() {
    }

    public static String getUsernameSignIn() {
        return usernameSignIn;
    }

    public static void setUsernameSignIn(String usernameSignIn) {
        HomeController.usernameSignIn = usernameSignIn;
    }

    public static String getPasswordSignIn() {
        return passwordSignIn;
    }

    public static void setPasswordSignIn(String passwordSignIn) {
        HomeController.passwordSignIn = passwordSignIn;
    }
}
