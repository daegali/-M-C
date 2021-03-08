package com.member.demo.controller;

import com.member.demo.model.User2;
import com.member.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "user/login";
    }

    @RequestMapping("/login")
    public String login(@RequestBody User2 user){
        userService.loginPost(user);
        return "redirect:/";

    }

}
