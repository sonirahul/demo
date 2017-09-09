package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class User {

    private String firstName;
    private String lastName;
}