package com.example.deloitte.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    @NotBlank(message = "Username is required")
    private String username;

    @Email(message = "Enter a valid email")
    private String email;

    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
}
