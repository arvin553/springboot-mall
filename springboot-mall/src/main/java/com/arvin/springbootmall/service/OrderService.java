package com.arvin.springbootmall.service;

import com.arvin.springbootmall.dto.CreateOrderRequest;
import com.arvin.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
