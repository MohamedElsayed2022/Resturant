package com.coding.resturant.controller;

import com.coding.resturant.model.Order;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.coding.resturant.service.OrderService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
public class OrderController {
    private final OrderService orderService;
    @GetMapping("orders")
  public List<Order> getAllOrders(){
      return orderService.getOrders();
  }
  @GetMapping("category")
  public List<Order> getOrdersByCategoryId(@RequestParam Long id){
        return orderService.getOrdersByCategoryId(id);
  }
  @GetMapping("orderKey")
    public List<Order> getOrdersByKey(@RequestParam String word){
        return orderService.getOrdersByKey(word);
  }
}
