package com.nlu.DecentAndCraft.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nlu.DecentAndCraft.model.status.OrderStatus;
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
@Table(name = "orders")
public class Order extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "address_id")
    Address address;
    @Enumerated(EnumType.STRING)
    OrderStatus status;
    @ManyToOne
    @JoinColumn(name = "voucher_id")
    Voucher voucher;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    String notice;
    double shippingFee;
    double totalPrice;
}
