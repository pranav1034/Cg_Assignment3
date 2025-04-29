package com.cg.User.Details3.model;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String country;

    public User() {
    }
}
