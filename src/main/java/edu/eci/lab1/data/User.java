package edu.eci.lab1.data;

import edu.eci.lab1.dto.UserDto;
import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String email;
    private String lastName;
    private Boolean createdAt;

    public User(){}
    public User(UserDto userDto){
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getLastName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
