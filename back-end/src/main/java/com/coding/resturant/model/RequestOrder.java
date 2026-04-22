package com.coding.resturant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private Set<Item> items = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_address_id" , referencedColumnName = "id")
    private Address toAddress = new Address();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_address_id" , referencedColumnName = "id")
    private Address fromAddress = new Address();

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client  client;


}
