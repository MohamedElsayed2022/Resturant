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
@Table(name = "countries")
public class Country extends PublicData{

    private String code;

    @OneToMany(mappedBy = "country")
    private List<State> states;
}
