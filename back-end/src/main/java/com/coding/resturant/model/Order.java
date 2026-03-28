package com.coding.resturant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends CategoryOrder {

    @Column(name = "price")
    private Double price;
    @Column(name = "image")
    private String img;
    @Column(name = "description")
   // @Lob
    private String description;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;



}
