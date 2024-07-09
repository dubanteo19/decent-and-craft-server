package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.dto.request.OrderDetailRequest;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T10:39:22+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Ubuntu)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toOrder(OrderAddRequest request) {
        if ( request == null ) {
            return null;
        }

        Order.OrderBuilder order = Order.builder();

        order.orderDetails( orderDetailRequestListToOrderDetailList( request.orderDetails() ) );
        order.shipment( request.shipment() );
        order.notice( request.notice() );
        order.shippingFee( request.shippingFee() );
        order.totalPrice( request.totalPrice() );

        return order.build();
    }

    protected OrderDetail orderDetailRequestToOrderDetail(OrderDetailRequest orderDetailRequest) {
        if ( orderDetailRequest == null ) {
            return null;
        }

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setQuantity( orderDetailRequest.quantity() );
        orderDetail.setPrice( orderDetailRequest.price() );

        return orderDetail;
    }

    protected List<OrderDetail> orderDetailRequestListToOrderDetailList(List<OrderDetailRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderDetail> list1 = new ArrayList<OrderDetail>( list.size() );
        for ( OrderDetailRequest orderDetailRequest : list ) {
            list1.add( orderDetailRequestToOrderDetail( orderDetailRequest ) );
        }

        return list1;
    }
}
