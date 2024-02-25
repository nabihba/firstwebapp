package com.example.firstwebapp.controles;//package com.example.firstwebapp.controles;
import com.example.firstwebapp.services.userServices;
import com.example.firstwebapp.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class userController {

    @Autowired
    private userServices userServices;

    @PostMapping("/users/addUser")
    public @ResponseBody user addUser(@RequestBody user u)
    {
        return userServices.addUser(u);
    }

    @GetMapping("/users/getAll")
    public @ResponseBody ArrayList<user> getAll()
    {
        return userServices.getAll();
    }

    @GetMapping("/user/findUserId/{id}")
    public @ResponseBody Optional<user> findUserById(@PathVariable Long id)
    {
        return userServices.findUserById(id);
    }

    @GetMapping("/user/login/{email}/{password}")
    public @ResponseBody user login(@PathVariable String email,@PathVariable String password){
        return userServices.login(email,password);}

}
