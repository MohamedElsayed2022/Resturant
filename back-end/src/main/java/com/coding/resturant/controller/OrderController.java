package com.coding.resturant.controller;

import com.coding.resturant.model.Order;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.coding.resturant.service.OrderService;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/api/orders")
  public List<Order> getAllOrders(){
      return orderService.getOrders();
  }
  @GetMapping("/api/category")
  public List<Order> getOrdersByCategoryId(@RequestParam Long categoryId){
        return orderService.getOrdersByCategoryId(categoryId);
  }
}
