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
<<<<<<< HEAD
    Integer origin;
    Integer price;
=======
    double price;
    double origin;
>>>>>>> 5c6129e9c8189f1d694a32949b711eb267269fbf
    @Enumerated(EnumType.STRING)
    ProductStatus status;
    int unitInStock;
}
