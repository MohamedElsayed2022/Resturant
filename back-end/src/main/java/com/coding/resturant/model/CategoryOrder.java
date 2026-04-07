package com.coding.resturant.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends  PublicData {

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
