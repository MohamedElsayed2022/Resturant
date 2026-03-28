package com.coding.resturant.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.coding.resturant.service.OrderService;

@RestController
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
}
