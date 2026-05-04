package com.coding.resturant.dto;


import com.coding.resturant.model.Address;
import com.coding.resturant.model.Client;
import com.coding.resturant.model.Item;
import com.coding.resturant.model.RequestOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {
    private Client client;
    private RequestOrder requestOrder;
    private List<Item> items = new ArrayList<>() ;
    private Address fromAddress;
    private Address toAddress;
}
