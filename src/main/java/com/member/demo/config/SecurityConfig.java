//package com.member.demo.config;
//
//import com.member.demo.service.UserService;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@AllArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private UserService userService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    public void configure(WebSecurity webSecurity) throws Exception{
//        webSecurity.ignoring().antMatchers("/");
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws  Exception{
//
//        httpSecurity
//                .csrf().disable()
//                .authorizeRequests()
//                // 페이지 권환 설정
//                .antMatchers("/")
//                .permitAll()
//                // 로그인 설정
//           .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/")
//                .permitAll()
//                // 로그아웃 설정
//            .and()
//                .logout()
//                .invalidateHttpSession(true);
//
//    }
//
//    public void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//    }
//
//}
