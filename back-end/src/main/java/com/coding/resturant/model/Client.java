package com.coding.resturant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client extends PublicData {

    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "client")
    private Set<RequestOrder>  requestOrders = new HashSet<>();

    public void  addRequestOrder(RequestOrder requestOrder) {
        requestOrders.add(requestOrder);
        requestOrder.setClient(this);
    }


}
