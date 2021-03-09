//package com.member.demo.controller;
//
//import com.member.demo.dto.UserDto;
//import com.member.demo.model.User2;
//import com.member.demo.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class UserController {
//
//    private UserService userService;
//
//    // 메인 페이지
//    @GetMapping("/")
//    public String index(){
//        return "/index";
//    }
//
//    // 회원가입 페이지
//    @GetMapping("/user/join")
//    public String joinUp(){
//        return "user/join";
//    }
//    // 회원가입 처리
//    @PostMapping("/user/join")
//    public String joinUp(UserDto userDto){
//        userService.joinUser(userDto);
//        return "redirect:/";
//    }
//
//    // 로그인 페이지
//    @GetMapping("/user/login")
//    public String login(){
//        return "user/login";
//    }
//
//    // 로그인 결과 페이지
//    @GetMapping("/user/login")
//    public String loginResult(){
//        return "redirect:/";
//    }
//
//    // 로그아웃 결과 페이지
//    @GetMapping("/user/logout")
//    public String logout(){
//        return "redirect:/";
//    }
//
//    // 내 정보 페이지
//    @GetMapping("/user/info")
//    public String myInfo(){
//        return "user/myinfo";
//    }
//
////    @GetMapping("/login")
////    public String loginForm() {
////        return "user/login";
////    }
////
////    @RequestMapping("/login")
////    public String login(@RequestBody User2 user){
////        userService.loginPost(user);
////        return "redirect:/";
////
////    }
//
//}
