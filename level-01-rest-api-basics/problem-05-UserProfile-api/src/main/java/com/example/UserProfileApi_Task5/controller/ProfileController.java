package com.example.UserProfileApi_Task5.controller;

import com.example.UserProfileApi_Task5.dto.Response;
import com.example.UserProfileApi_Task5.dto.UserDto;
import com.example.UserProfileApi_Task5.entity.UserProfile;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


@RestController
@RequestMapping("/user")
public class ProfileController {

    int id = 1;
    HashMap<Integer, UserProfile> users = new HashMap<>();

    @PostMapping("/add")
    public ResponseEntity<Response> add_user(@RequestBody UserDto userdto)
    {
        UserProfile user = new UserProfile();
        user.setBio(userdto.getBio());
        user.setName(userdto.getUsername());
        user.setUsername(userdto.getUsername());
        user.setUserid(id);
        users.put(id,user);
        id++;
        Response response = new Response("User added",user);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Response> get_user(@PathVariable int id)
    {
        Response response = new Response();
        if(!users.containsKey(id)){
            response.setFeedback("User not found");
            response.setProfile(null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        else{
            response.setFeedback("User  found");
            response.setProfile(users.get(id));
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    @GetMapping("/get")
    public Collection<UserProfile> getAllUser()
    {
        return users.values();
    }
}
