package com.arvin.springbootmall.service;

import com.arvin.springbootmall.dto.UserRegisterRequest;
import com.arvin.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
