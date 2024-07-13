package com.nlu.DecentAndCraft.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
    double price;

    public void sell() {
        product.sell(quantity);
    }
}
