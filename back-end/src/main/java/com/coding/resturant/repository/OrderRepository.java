package com.coding.resturant.repository;
import com.coding.resturant.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
     Page<Order> findByCategoryId(Long categoryId , Pageable pageable);
     Page<Order> findByNameContaining(String Key , Pageable pageable);
     Optional<Order> findOrderById(Long id);
}
