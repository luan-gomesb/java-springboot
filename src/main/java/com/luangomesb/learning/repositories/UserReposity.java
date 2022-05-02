package com.luangomesb.learning.repositories;

import com.luangomesb.learning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User,Long> {

}
