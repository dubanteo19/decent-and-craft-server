package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.OrderDetail;
import com.nlu.DecentAndCraft.model.status.OrderStatus;
import com.nlu.DecentAndCraft.service.OrderService;
import com.nlu.DecentAndCraft.service.ProductService;
import com.nlu.DecentAndCraft.service.UserService;
import com.nlu.DecentAndCraft.service.VoucherService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(8)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderLoader implements CommandLineRunner {
    OrderService orderService;
    VoucherService voucherService;
    UserService userService;
    ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        OrderStatus status1 = OrderStatus.CHO_VAN_CHUYEN;
        var voucher1 = voucherService.getVoucherById(1L);
        var address1 = userService.getAddressById(1L);
        var od1 = new OrderDetail();
        var p1 = productService.findById(1L);
        od1.setPrice(p1.getPrice());
        od1.setQuantity(2);
        od1.setProduct(p1);
        var od2 = new OrderDetail();
        var p2 = productService.findById(2L);
        od2.setPrice(p2.getPrice());
        od2.setQuantity(5);
        od2.setProduct(p2);
        var user1 = userService.findById(1L);
        List<OrderDetail> orderDetails1 = new ArrayList<>(
                List.of(od1, od2)
        );
        var o1 = com.nlu.DecentAndCraft.model.Order.builder()
                .notice("Giao nhanh nhanh nha")
                .status(status1)
                .shippingFee(200000)
                .voucher(voucher1)
                .address(address1)
                .orderDetails(orderDetails1)
                .user(user1)
                .shipment("COD")
                .build();
        orderService.createOrder(o1);
    }
}
