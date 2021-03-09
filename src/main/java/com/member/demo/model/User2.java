//package com.member.demo.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class User2 {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(nullable = false, length = 50)
//    private String username;
//
//    @Column(nullable = false, length = 100)
//    private String password;
//
//    @Column(nullable = false, length = 40)
//    private String email;
//
//    @Enumerated(EnumType.STRING)
//    private RoleType role; // 정확하게 하려면 Enum을 쓰는게 좋다.(회원의 등급을 설정), 도매인 = 어떤 범위
//
//
//    @Builder
//    public User2(int id, String username, String password, String email){
//        this.id=id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//}
//}
