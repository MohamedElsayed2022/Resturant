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

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "requestOrder")
    private List<Item> items;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_address_id" , referencedColumnName = "id")
    private Address toAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_address_id" , referencedColumnName = "id")
    private Address fromAddress;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client  client;


}
