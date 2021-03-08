package com.member.demo.repository;

import com.member.demo.model.User2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User2, Integer> {

    User2 findByUsernameAndPassword(String username, String password);

}
