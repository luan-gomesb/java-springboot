package com.luangomesb.learning.repositories;

import com.luangomesb.learning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
