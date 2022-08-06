package com.luangomesb.learning.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.luangomesb.learning.entities.User;

@SpringBootTest
class UserServiceTest {

	@Test
	void test() {
		UserService service = new UserService();
		User us = service.findById(new Long(1));
		assertEquals(new Long(1), us.getId());
	}

}
