package model;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order extends CategoryOrder {

    @Column(name = "price")
    private Double price;
    @Column(name = "img")
    private String img;
    @Column(name = "description")
    private String description;

}
