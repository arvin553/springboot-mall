package com.arvin.springbootmall.service;

import com.arvin.springbootmall.dto.CreateOrderRequest;
import com.arvin.springbootmall.dto.OrderQueryParams;
import com.arvin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
