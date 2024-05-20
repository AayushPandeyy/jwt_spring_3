package com.jwt.example.JwtExample.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JwtResponse {

    private String token;

    private String username;
}
