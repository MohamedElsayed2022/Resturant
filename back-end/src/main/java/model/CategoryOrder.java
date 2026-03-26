package model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends  BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime lastModifiedDate;
}
