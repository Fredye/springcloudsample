package com.dongyun.app.dao.persistence;


import com.dongyun.app.dao.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String oidUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String oidUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}