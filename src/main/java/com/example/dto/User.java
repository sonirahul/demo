package com.example.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class User {

    private String firstName;
    private String lastName;
    @NotNull
    private String school = null;

    @NotNull
    private String indirectMix() {
        String mix = null;
        return mix;
    }
}