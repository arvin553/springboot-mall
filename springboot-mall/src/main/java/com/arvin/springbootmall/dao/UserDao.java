package com.arvin.springbootmall.dao;

import com.arvin.springbootmall.dto.UserRegisterRequest;
import com.arvin.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
