package com.luangomesb.learning.services;

import com.luangomesb.learning.entities.Order;
import com.luangomesb.learning.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Register class as component, so spring can inject with @AutoWired where we need
We have yet @Repository and @Service to do this, just for semantic
* */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> userObj = orderRepository.findById(id);
        return userObj.get();
    }
}
