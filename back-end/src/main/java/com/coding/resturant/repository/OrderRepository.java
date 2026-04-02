package com.coding.resturant.repository;
import com.coding.resturant.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
     Page<Order> findByCategoryId(Long categoryId , Pageable pageable);
     Page<Order> findByNameContaining(String Key , Pageable pageable);
     @Query("select count(o.id) from Order o where o.category.id = ?1")
     Long getOrderLengthByCategoryId(Long categoryId);
     @Query("select count(o.id) from Order o where o.name like %?1%")
     Long getOrderLengthByKey(String Key);
}
