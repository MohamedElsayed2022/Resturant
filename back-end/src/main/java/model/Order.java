package model;

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
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;



}
