package com.example.demo.Metier;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMetierImpl implements UserMetier {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> authenficateUser(String mail) {
        return userRepository.findAllByMail(mail);
    }
}
