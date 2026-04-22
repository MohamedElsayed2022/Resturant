package com.coding.resturant.service;

import com.coding.resturant.dto.PurchaseRequest;
import com.coding.resturant.dto.PurchaseResponse;

public interface PurchaseService {
    public PurchaseResponse addRequestOrder(PurchaseRequest purchase);
}
