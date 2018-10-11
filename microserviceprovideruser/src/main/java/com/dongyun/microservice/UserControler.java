package com.dongyun.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fqye2 on 2018/9/19.
 */
@RestController
@RefreshScope
public class UserControler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findById(id).orElse(null);
        return findOne;
    }

    @GetMapping("/user/all")
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){
        return this.profile;
    }
}

