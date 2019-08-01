package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
UserRepository userRepository;

@Autowired
public UserServiceImpl(UserRepository userRepository)
{
this.userRepository=userRepository;
}
    @Override
    public User saveUser
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
