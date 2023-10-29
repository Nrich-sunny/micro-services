package com.example.customer.controller;

import com.example.customer.dto.post.Order;
import com.example.customer.service.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private OrderClient orderClient;

    @GetMapping("/create-order")
    public String createOrder() {
        Order order = new Order();
        order.setOrderId("1");
        order.setOrderName("bag");

        // 像调用本地方法一样，调用 openfeign client 中的方法
        return orderClient.createOrder(order);
    }

    @GetMapping("/test")
    public String test() {
        return "TEST...";
    }
}
