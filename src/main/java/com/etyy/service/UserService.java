package com.etyy.service;

import com.etyy.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
@Service
public class UserService implements UserServiceImpl {
    @Resource
    UserRepository userRepository;
}
