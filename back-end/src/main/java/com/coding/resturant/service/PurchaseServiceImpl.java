package com.coding.resturant.service;

import com.coding.resturant.dto.PurchaseRequest;
import com.coding.resturant.dto.PurchaseResponse;
import com.coding.resturant.model.Item;
import com.coding.resturant.model.RequestOrder;
import com.coding.resturant.repository.ClientRepository;
import jakarta.transaction.Transactional;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PurchaseServiceImpl implements PurchaseService {
    private ClientRepository clientRepository;
    @Override
    @Transactional
    public PurchaseResponse addRequestOrder(PurchaseRequest purchase) {
        //[1]
        RequestOrder requestOrder = purchase.getRequestOrder();
        String myCode = getCode();
        requestOrder.setCode(myCode);
        //[2]

        Set<Item> items = purchase.getItems();
        items.forEach(requestOrder::addItem);
        //[3]
        requestOrder.setFromAddress(purchase.getFromAddress());
        requestOrder.setToAddress(purchase.getToAddress());
        //[4]
        purchase.getClient().addRequestOrder(requestOrder);
        clientRepository.save(purchase.getClient());

        return new PurchaseResponse(purchase.getClient().getName() , myCode);
    }

    private String getCode() {
        return UUID.randomUUID().toString();
    }
}
