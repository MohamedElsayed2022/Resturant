package com.coding.resturant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "request_order")
public class RequestOrder extends CategoryOrder {
    @Column(name = "code")
    private String code;
    @Column(name = "note")
    @Lob
    private String note ;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "total_quantity")
    private int totalQuantity;

    @OneToMany
    @JoinColumn(name = "item_id")
    private List<Item> items;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "requestOrders")
    private Client  client;


}
