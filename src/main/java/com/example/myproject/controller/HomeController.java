package com.example.myproject.controller;

import com.example.myproject.entity.User;
import com.example.myproject.service.ImageInterface;
import com.example.myproject.service.RoleInterface;
import com.example.myproject.service.UserInterface;
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
    public String signIn() {
        return "signIn";
    }

    @GetMapping("/")
    public String start() {
        return "redirect:/home";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "signUp";
    }

    @GetMapping("/checking")
    public String signUp(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
            User user = u.getUserSignIn(username, password);
            if (user == null){
                model.addAttribute("error", "Account or password is incorrect!");
                return "signIn";
            }
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công");
                usernameSignIn = username;
                passwordSignIn = password;
                if (user.getRole().getId() == 1) {
                    return "redirect:/admin/home";
                } else if (user.getRole().getId() == 2) {
                    return "redirect:/user/home";
                } else {
                    model.addAttribute("error", "Account or password is incorrect!");
                    return "signIn";
                }
            }
        model.addAttribute("error", "Account or password is incorrect!");
        return "signIn";
    }

    @GetMapping("/infomation")
    public String infomation(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "nonUserInfomation";
    }

    @GetMapping("/admin/infomation")
    public String adminInfomation(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "adminInfomation";
    }

    @GetMapping("/user/infomation")
    public String userInfomation(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "userInfomation";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "nonUserContact";
    }

    @GetMapping("/admin/contact")
    public String adminContact(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "adminContact";
    }

    @GetMapping("/user/contact")
    public String userContact(Model model) {
        model.addAttribute("infomation", u.getUserSignIn(getUsernameSignIn(), getPasswordSignIn()));
        return "userContact";
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
