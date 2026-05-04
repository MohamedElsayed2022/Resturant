package com.coding.resturant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@NoArgsConstructor
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
    private List<RequestOrder>  requestOrders = new ArrayList<>();

    public void  addRequestOrder(RequestOrder requestOrder) {
        requestOrders.add(requestOrder);
        requestOrder.setClient(this);
    }


}
