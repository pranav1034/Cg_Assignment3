package com.cg.User.Details3.controller;

import com.cg.User.Details3.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    public String showPage1(Model model) {
        model.addAttribute("user", new User());
        return "page1";
    }

    @PostMapping("/page1")
    public String processPage1(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "page2";
    }

    @PostMapping("/page2")
    public String processPage2(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "page3";
    }

    @PostMapping("/page3")
    public String processPage3(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "page4";
    }
}
