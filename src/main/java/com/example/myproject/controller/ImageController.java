package com.example.myproject.controller;

import com.example.myproject.entity.Image;
import com.example.myproject.service.ImageInterface;
import com.example.myproject.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String adminPictrue(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("mainImage", ii.findByName("main_image"));
        model.addAttribute("achievementImage", ii.findByName("achievement_image"));
        return "adminPicture";
    }

    @GetMapping("/user/picture")
    public String userPictrue(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("mainImage", ii.findByName("main_image"));
        model.addAttribute("achievementImage", ii.findByName("achievement_image"));
        return "userPicture";
    }

    @GetMapping("/picture")
    public String pictrue(Model model) {
        model.addAttribute("myInfomation", u.getReferenceById(1));
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        model.addAttribute("mainImage", ii.findByName("main_image"));
        model.addAttribute("achievementImage", ii.findByName("achievement_image"));
        return "nonUserPicture";
    }

    @PostMapping("/admin/picture/add")
    public String addPicture(Image i, @RequestParam("linkImg") String image, @RequestParam("nameImage") String name) {
        i.setImage(image);
        i.setName(name);
        Random random = new Random();
        int randomNumber = 3 + random.nextInt(9);
        i.setCol(randomNumber);
        ii.save(i);
        return "redirect:/admin/picture/form/add";
    }

    @PostMapping("/admin/picture/update")
    public String updatePicture(Image i, @RequestParam("linkImg") String image, @RequestParam("nameImage") String name) {
        i.setImage(image);
        i.setName(name);
        ii.save(i);
        return "redirect:/admin/picture/form/add";
    }

    @GetMapping("/admin/picture/form/add")
    public String formAdd(Model model) {
        model.addAttribute("listImage", ii.getAll());
        model.addAttribute("infomation", u.getUserSignIn(hc.getUsernameSignIn(), hc.getPasswordSignIn()));
        return "formAddImage";
    }

    @GetMapping("/admin/picture/delete-image")
    public String formAdd(@RequestParam("id") Integer id) {
        ii.delete(ii.getReferenceById(id));
        return "redirect:/admin/picture/form/add";
    }

    @GetMapping("/admin/detail-image")
    public String detailImage(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("listDetail", ii.getReferenceById(id));
        model.addAttribute("listImage", ii.findAll());
        return "formAddImage";
    }
}
