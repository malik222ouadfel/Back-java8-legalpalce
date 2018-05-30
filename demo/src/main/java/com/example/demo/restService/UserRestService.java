package com.example.demo.restService;


import com.example.demo.Metier.UserMetier;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class UserRestService {
    @Autowired
    private UserMetier userMetier;


    @RequestMapping(value="/user/{mail}", method = RequestMethod.GET)
    public User getUser(@PathVariable("mail")  String mail) {
        List<User> users = userMetier.authenficateUser(mail);
        if(users == null || users.isEmpty()) return null;
        return users.get(0);
    }
}
