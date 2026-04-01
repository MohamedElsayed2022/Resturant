package com.coding.resturant.repository;
import com.coding.resturant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
     List<Order> findByCategoryId(Long categoryId);
     List<Order> findByNameContaining(String Key);
     Optional<Order> findOrderById(Long id);
}
