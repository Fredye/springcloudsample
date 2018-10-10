package com.dongyun.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fqye2 on 2018/9/19.
 */
@RestController
public class UserControler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findById(id).orElse(null);
        return findOne;
    }
}

