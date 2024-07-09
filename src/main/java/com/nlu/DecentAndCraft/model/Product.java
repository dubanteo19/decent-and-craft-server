package com.nlu.DecentAndCraft.model;

import com.nlu.DecentAndCraft.model.status.ProductStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Product extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String thumbnail;
    double price;
    double origin;
    @Enumerated(EnumType.STRING)
    ProductStatus status;
    int unitInStock;
}
