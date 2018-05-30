package com.example.demo.Metier;

import com.example.demo.model.User;

import java.util.List;

public interface UserMetier {
    public List<User> authenficateUser(String mail);

}
