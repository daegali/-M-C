//package com.member.demo.service;
//
//import com.member.demo.dto.UserDto;
//import com.member.demo.model.RoleType;
//import com.member.demo.model.User2;
//import com.member.demo.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@AllArgsConstructor
//public class UserService implements UserDetailsService {
//
//
//    private UserRepository userRepository;
//
//    @Transactional
//    public int joinUser(UserDto userDto) {
//        // 비밀번호 암호화
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
//
//        return userRepository.save(userDto.toEntity()).getId();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
//        Optional<User2> userEntityWrapper = userRepository.findByUsername(userEmail);
//        User2 userEntity = userEntityWrapper.get();
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        if (("admin@example.com").equals(userEmail)) {
//            authorities.add(new SimpleGrantedAuthority(RoleType.ADMIN.getValue()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(RoleType.USER.getValue()));
//        }
////
////        return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
//        return (UserDetails) new User2(userEntity.getId(),userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
//    }
//}
//
//
//
//
//
////    @Transactional
////    public Long joinUser(User2 user){
////        // 비밀번호 암호화
////
////        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////        user.setPassword(passwordEncoder.encode(user.getPassword()));
////
////        return userRepository.save(user.toEntity()).getId);
////    }
////    @Transactional
////    public User2 loginPost(int id, User2 user){
////        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());    }
////    @Transactional(readOnly = true)
////    public User2 loginPost(@RequestBody User2 user) {
////        System.out.println("-------UserService--username=" + user.getUsername());
////        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());    }
//
//
//
