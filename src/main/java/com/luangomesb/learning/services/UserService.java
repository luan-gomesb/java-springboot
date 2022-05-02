package com.luangomesb.learning.services;

import com.luangomesb.learning.entities.User;
import com.luangomesb.learning.repositories.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Register class as component, so spring can inject with @AutoWired where we need
We have yet @Repository and @Service to do this, just for semantic
* */
@Service
public class UserService {
    @Autowired
    private UserReposity userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> userObj = userRepository.findById(id);
        return userObj.get();
    }
}
