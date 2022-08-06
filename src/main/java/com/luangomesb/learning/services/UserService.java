package com.luangomesb.learning.services;

import com.luangomesb.learning.entities.User;
import com.luangomesb.learning.repositories.UserRepository;
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
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> userObj = userRepository.findById(id);
        return userObj.get();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(Long uid, User obj) {
        User entity = userRepository.getOne(uid);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setEmail(obj.getEmail());
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }

    public void delete(Long id) {
        User user = userRepository.getById(id);
        userRepository.delete(user);
    }
}
