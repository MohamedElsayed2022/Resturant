package com.coding.resturant.controller;
import com.coding.resturant.dto.PurchaseRequest;
import com.coding.resturant.dto.PurchaseResponse;
import com.coding.resturant.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/buy/")
public class PurchaseController {
    private  PurchaseService purchaseService;

    @PostMapping("purchase")
    public PurchaseResponse addRequestOrder(@RequestBody PurchaseRequest purchaseRequest) {
       return purchaseService.addRequestOrder(purchaseRequest);

    }
}
