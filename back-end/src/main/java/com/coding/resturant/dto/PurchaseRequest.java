package com.coding.resturant.dto;


import com.coding.resturant.model.Address;
import com.coding.resturant.model.Client;
import com.coding.resturant.model.Item;
import com.coding.resturant.model.RequestOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {
    private Client client;
    private RequestOrder requestOrder;
    private List<Item> items;
    private Address fromAddress;
    private Address toAddress;
}
