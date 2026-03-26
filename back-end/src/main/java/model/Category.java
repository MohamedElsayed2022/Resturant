package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category extends CategoryOrder {

    @OneToMany(mappedBy = "category")
    private Set<Order> orders;

}
