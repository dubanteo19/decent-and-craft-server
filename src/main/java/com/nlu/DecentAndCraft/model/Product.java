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
    public Product(Long id, String name,
                   String thumbnail, double price, double origin, ProductStatus status, int unitInStock) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.origin = origin;
        this.status = status;
        this.unitInStock = unitInStock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String thumbnail;
    double price;
    private int views;
    private int soldQuantity;
    double origin;
    @Enumerated(EnumType.STRING)
    ProductStatus status;
    int unitInStock;

    public void sell(int quantity) {
        if (quantity > unitInStock) throw new IllegalArgumentException("Not enough units in stock");
        unitInStock -= quantity;
        soldQuantity += quantity;
    }
}
