package com.nlu.DecentAndCraft.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "voucher")
public class Voucher extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String voucherCode;
    String description;
    int quantity;
    double amount;
    double conditions;
    LocalDate expirationDate;
    @OneToMany(mappedBy = "voucher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    List<Order> orders;
}
