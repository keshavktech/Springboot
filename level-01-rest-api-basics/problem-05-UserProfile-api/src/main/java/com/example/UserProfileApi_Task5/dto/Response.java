package com.example.UserProfileApi_Task5.dto;

import com.example.UserProfileApi_Task5.entity.UserProfile;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private UserProfile profile;
    private String feedback;

    public Response(String feedback,UserProfile profile)
    {
        this.feedback = feedback;
        this.profile = profile;
    }

    public Response(){

    }

}
