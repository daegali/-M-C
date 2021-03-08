package com.member.demo.service;

import com.member.demo.model.User2;
import com.member.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Transactional
//    public User2 loginPost(int id, User2 user){
//        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());    }
    @Transactional(readOnly = true)
    public User2 loginPost(@RequestBody User2 user) {
        System.out.println("-------UserService--username=" + user.getUsername());
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());    }

}

