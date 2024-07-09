package com.nlu.DecentAndCraft.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nlu.DecentAndCraft.model.status.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
@Builder
public class Order extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "address_id")
    @JsonIgnore
    Address address;
    @Enumerated(EnumType.STRING)
    OrderStatus status;
    @ManyToOne
    @JoinColumn(name = "voucher_id")
    Voucher voucher;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    User user;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    List<OrderDetail> orderDetails;
    String shipment;
    String notice;
    double shippingFee;
    double totalPrice;
}
