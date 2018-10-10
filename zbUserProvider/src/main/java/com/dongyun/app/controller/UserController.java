package com.dongyun.app.controller;

import com.dongyun.app.dao.entity.User;
import com.dongyun.app.dao.persistence.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Resource
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        LOG.info("getUser id=" + id);
        if (StringUtils.isEmpty(id)) {
            return new User();
        }
        return userMapper.selectByPrimaryKey(id);
    }
}
