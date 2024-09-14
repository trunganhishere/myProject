//package com.example.myproject.controller;
//
//import com.example.myproject.entity.User;
//import com.example.myproject.service.UserInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.List;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//    @Autowired
//    UserInterface ui;
//
//    @Autowired
//    HomeController hc;
//    @Bean
//    public SecurityFilterChain chain(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeHttpRequests(r -> {
//            try {
//                r.requestMatchers("/admin/**").hasRole("Admin")
//                        .requestMatchers("/user/**").hasAnyRole("Admin","User").anyRequest().permitAll()
//                        .and().formLogin(login -> login.loginPage("/sign-in"));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        User user = ui.getUserSignIn(hc.getUsernameSignIn(),hc.getPasswordSignIn());
//        PasswordEncoder pe = new BCryptPasswordEncoder();
//        if(user == null){
//            UserDetails userDetails1 = org.springframework.security.core.userdetails.User.builder()
//                    .username("staff")
//                    .password("{bcrypt}"+pe.encode("staff"))
//                    .build();
//            return new InMemoryUserDetailsManager(userDetails1);
//        }else{
//            UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
//                    .username(user.getUsername())
//                    .password("{bcrypt}"+pe.encode(user.getPassword()))
//                    .roles(user.getRole().getName())
//                    .build();
//            return new InMemoryUserDetailsManager(userDetails);
//        }
//    }
//}
