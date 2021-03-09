//package com.member.demo.dto;
//
//import com.member.demo.model.User2;
//import lombok.*;
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//public class UserDto {
//    private int id;
//    private String username;
//    private String email;
//    private String password;
//
//
//    public User2 toEntity(){
//        return User2.builder()
//                .id(id)
//                .email(email)
//                .password(password)
//                .build();
//    }
//
//    @Builder
//    public UserDto(int id, String email, String password) {
//        this.id = id;
//        this.email = email;
//        this.password = password;
//    }
//}
