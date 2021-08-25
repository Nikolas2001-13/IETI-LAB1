package edu.eci.lab1.service.impl;

import edu.eci.lab1.data.User;
import edu.eci.lab1.exception.UserException;
import edu.eci.lab1.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {

    private HashMap<String, User> userHashMap;

    public UserServiceHashMap(){}

    @Override
    public User create(User user) {
        userHashMap.put(user.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) throws UserException {
        if(userHashMap.containsKey(id)){
            return userHashMap.get(id);
        }
        throw new UserException(UserException.USER_NOT_FOUND);
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(userHashMap.values());
    }

    @Override
    public void deleteById(String id) {
        userHashMap.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        userHashMap.replace(userId,user);
        return user;
    }
}
