package edu.eci.lab1.service;

import edu.eci.lab1.data.User;
import edu.eci.lab1.exception.UserException;

import java.util.List;

public interface UserService {

    User create(User user );

    User findById( String id ) throws UserException;

    List<User> all();

    void deleteById( String id );

    User update( User user, String userId );

}
