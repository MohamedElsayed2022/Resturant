package com.coding.resturant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item")
public class Item extends BaseEntity {
    @Column(name = "image")
    private String img;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private int price;

    @ManyToOne
    private RequestOrder requestOrder;

}
