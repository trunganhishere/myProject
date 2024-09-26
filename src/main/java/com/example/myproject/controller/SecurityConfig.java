package com.example.myproject.controller;

import com.example.myproject.entity.User;
import com.example.myproject.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Autowired
    UserInterface ui;

    @Autowired
    HomeController hc;
    @Bean
    public SecurityFilterChain chain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeHttpRequests(r ->r.requestMatchers("/admin/**").authenticated().anyRequest().permitAll())
                        .formLogin();
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        PasswordEncoder pe = new BCryptPasswordEncoder();
            UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
                    .username("trunganhishere")
                    .password("{bcrypt}"+pe.encode("TyNuaNoi204"))
                    .build();
            return new InMemoryUserDetailsManager(userDetails);
    }
}
