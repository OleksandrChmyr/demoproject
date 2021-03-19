package com.example.demoproject.entity;

import lombok.Data;

public enum Role {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    ANALYST("Analyst");

    private String role;

    Role(String role) {
        this.role = role;
    }
}
