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
    @GetMapping("allOrders")
  public List<Order> getAllOrders(@RequestParam int page , @RequestParam int size){
        return orderService.getOrders(page , size);
  }
  @GetMapping("category")
  public List<Order> getOrdersByCategoryId( @RequestParam int page , @RequestParam int size ,@RequestParam Long id){
        return orderService.getOrdersByCategoryId(id , page , size);
  }
  @GetMapping("orderKey")
    public List<Order> getOrdersByKey( @RequestParam int page , @RequestParam int size , @RequestParam String word){
        return orderService.getOrdersByKey(word , page , size);
  }
  @GetMapping("order")
    public Order getOrderById(  @RequestParam Long id){
        return orderService.getOrderById(id);
  }
  @GetMapping("orderSize")
  public Long getOrdersSize(){
        return orderService.getOrdersSize();
  }
}
