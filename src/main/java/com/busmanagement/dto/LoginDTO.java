package com.busmanagement.dto;

/**
 * Data Transfer Object for login information.
 * Used to transfer login credentials between the frontend and backend.
 */
public class LoginDTO {
    private String username;
    private String password;

    // Default constructor
    public LoginDTO() {
    }

    // Constructor with fields
    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "username='" + username + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }
}
