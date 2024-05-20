package com.jwt.example.JwtExample.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private String uid;
    private String name;
    private String email;
}
