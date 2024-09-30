package org.mandulis.mts.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private List<String> roles;

    public JwtResponse(String token, Long id, String username, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}

