package com.coding.resturant.service;

import com.coding.resturant.model.Order;
import com.coding.resturant.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
    public List<Order> getOrdersByCategoryId(Long categoryId) {
        return orderRepository.findByCategoryId(categoryId);
    }
    public List<Order> getOrdersByKey(String Key){
        return orderRepository.findByNameContaining(Key);
    }

}
