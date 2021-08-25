package edu.eci.lab1.dto;

public class UserDto {

    private String name;
    private String email;
    private String lastName;
    private Boolean createdAt;

    public UserDto(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Boolean createdAt) {
        this.createdAt = createdAt;
    }
}
